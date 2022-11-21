import './App.css';
import Homepage from "./components/homepage/Homepage"
import Login from "./components/login/Login"
import About from './components/homepage/About';
import Jobs from './components/homepage/Jobs';
import Contact from './components/homepage/Contact';
import {
  BrowserRouter as Router,
  Routes,
  Route

} from "react-router-dom";
import { Fragment, useState } from 'react';
function App() {
  const [user, setLoginUser] = useState({

  })
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route exact path="/homepage" element={<Homepage/>}></Route>
          <Route exact path="/homepage/about" element={<About/>}></Route>
          <Route exact path="/homepage/jobs" element={<Jobs/>}></Route>
          <Route exact path="/homepage/contact" element={<Contact/>}></Route>
          <Route exact path="/" element={<Login setLoginUser={setLoginUser} />}></Route>
        </Routes>
      </Router>

    </div>
  );
}

export default App;