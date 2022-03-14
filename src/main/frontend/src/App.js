import React, { Component, useState, createContext, useContext, useEffect } from 'react'
import { BrowserRouter as Router, Route, Routes, Redirect } from "react-router-dom";
import './styles/App.scss'
import Home from './pages/Home'
import Login from './pages/Login'
import Registration from './pages/Registration'
import Faq from './pages/Faq'
import axios from "axios"


const LoginContext = React.createContext();


export default class App extends Component {
  

  render() {
    return (
      <>
      
      <Router>
          <Routes>
            <Route path='/' element={<Login/>}></Route>
            <Route path='/faq' element={<Faq/>}></Route>
            <Route path='/home' element={<Home/>}></Route>
            <Route path='/registration' element={<Registration/>}></Route>
            
            
          </Routes>
        
      </Router>
      </>
    )
  }
}

