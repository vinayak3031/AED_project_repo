const express = require('express');
const router = express.Router();
const bcrypt = require('bcrypt');
const mongoose = require('mongoose');
// const { User } = require('../models/user');
const User = mongoose.model('Assignment8');


console.log('User: ', User);
router.get('/user/getAll', (req, res) => {
    User.find({}, (err, data) => {
        if (!err) {
            res.send(data);
        } else {
            console.log(err);
        }
    })
});

router.post("/Login",(req,res)=>{
    const {email,password} =req.body;
    User.findOne({email:email},(err,user)=>{
        if(user){
            bcrypt.compare(password, user.password).then(isMatch => {
                if (isMatch) {
               res.send({message:"login sucess",user:user})
                } else{
                    res.send({message:"wrong credentials"})
                }
            })
        }else{
            res.send({message: "not register"})
        }
    })
});

//Get single user
router.get('/user/:id', (req, res) => {
    User.findById(req.params.id, (err, data) => {
        if (!err) {
            res.send(data);
        } else {
            console.log(err);
        }
    })
})

// save users
router.post('/user/create', (req, res) => {
    console.log(req.body)
    var user = new User();
    user.name = req.body.name;
    user.email = req.body.email;
    user.password = req.body.password;
    user.save((err, data) => {
        if (!err){
            let emailRegex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            let usernameRegex = /^[a-z ,.'-]+$/
            if(emailRegex.test(data.email) && usernameRegex.test(data.name)){
                res.status(200).json({ code: 200, message: 'User Added Successfully', addUser: data })
            } else {
                console.log(data.password)
                if(emailRegex.test(data.email) === false){
                    res.status(500).json({ code: 500, message: 'Invalid Email' })
                }
                if(usernameRegex.test(data.name) === false){
                    res.status(500).json({ code: 500, message: 'Invalid Username. Your username should not contain any digits.' })
                }
            }
        }
        else {
            console.log('Error during record insertion : ' + err);
        }
    });
})

//Update user data
router.put('/user/edit', (req, res) => {
    User.findOneAndUpdate({ email: req.body.email }, req.body, { new: true }, (err, data) => {
        if (!err && data !== null) { 
            res.status(200).json({ code: 200, message: "User Updated Successfully", updateUser: data }); 
        }
        else {
            res.status(500).json({ code: 500, message: "Email Id not found" }); 
        }
    });
})

router.delete('/user/delete', (req, res) => {
    User.findOneAndRemove(req.body.email, (err, data) => {
        if (!err) {
            res.status(200).json({ code: 200, message: "User Deleted Successfully", deleteUser: data });
        } else {
            console.log(err);
        }
    })
})

module.exports = router;