import React, { useState } from 'react';
import axios from 'axios';
import {useNavigate, Navigate} from "react-router-dom"
const Login = ({setLoginUser}) => {
const navigate = useNavigate()
    const [user,setUser] = useState({
        name:"",
        password: ""
    })
    const [signedIn, setSignedIn] = useState(false)
    const handleChange = e =>{
    const {name,value} = e.target
    setUser({
    ...user,//spread operator 
    [name]:value
    })
    }

    const login =(e)=>{
        e.preventDefault();
        console.log(user)
        axios.post("http://localhost:3000/Login",user)
        .then(res=>{
            alert(res.data.message)
            if(res.data.message === "login sucess"){
                navigate('/homepage')
            }
            console.log(res.data.user)
            setLoginUser(res.data.user)
            setSignedIn(!signedIn)
        })

    }
    // if(signedIn){
    //     return 
    // }
    return (
        <>
<div class="flex flex-col w-full max-w-md px-4 py-8 bg-white rounded-lg shadow dark:bg-gray-800 sm:px-6 md:px-8 lg:px-10">
    <div class="self-center mb-6 text-xl font-light text-gray-600 sm:text-2xl dark:text-white">
        Login To Your Account
    </div>
    <div class="mt-8">
        <form autoComplete="off">
            <div class="flex flex-col mb-2">
                <div class="flex relative ">
                    <input type="text" id="sign-in-email" class=" rounded-r-lg flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" name="email" value={user.email}  onChange={handleChange} placeholder="Your email"/>
                    </div>
                </div>
                <div class="flex flex-col mb-6">
                    <div class="flex relative ">
                        <input type="password" id="sign-in-password" class=" rounded-r-lg flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" name="password" value={user.password}  onChange={handleChange} placeholder="Your password"/>
                        </div>
                    </div>
                    <div class="flex w-full">
                        <button type="submit" class="py-2 px-4  bg-purple-600 hover:bg-purple-700 focus:ring-purple-500 focus:ring-offset-purple-200 text-black w-full transition ease-in duration-200 text-center text-base font-semibold shadow-md focus:outline-none focus:ring-2 focus:ring-offset-2  rounded-lg  " onClick={login}>
                            Login
                        </button>
                    </div>
                </form>
            </div>
        </div>

        </>
    )
}
export default Login