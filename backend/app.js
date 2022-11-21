const express = require('express');
const bodyParser = require('body-parser');
const dotenv = require('dotenv');
require('./models/user');
const app = express();
const cors = require('cors');
app.use(cors());
app.use(bodyParser.json());



const connectDB = require('./config/db');

//LOAD
dotenv.config({path: './config/config.env'});

connectDB();

// Routes
app.use('/', require('./routes/index'));


app.listen(3000);
