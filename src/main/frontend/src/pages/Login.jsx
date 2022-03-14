import React, { Component } from 'react'
import logo from '../images/logo.svg'
import { Link } from 'react-router-dom'
import '../styles/pages/Login.scss'

export default class Login extends Component {

    constructor(){
        super()
        this.state = {
            email: '',
            password: ''
        }
    }

    


    loginSubmit = (e) => {
        e.preventDefault()
    }

    render() {
        return (
            <div className='login-page'>
                <img src={logo} alt='logo' className='main-logo'/>
                <form onSubmit={this.loginSubmit}>
                    <label className='label'>
                        Email
                        <input type='text' ></input>
                    </label>
                    <label className='label'>
                        Password
                        <input type='text'></input>
                    </label>

                    <Link to="/registration">
                        <button className='button-1'>Register</button>
                    </Link>
                    
                
                    <input type='submit' value='Login' className='button-1'></input>

                    
                </form>

            
                
            </div>
        )
    }
}
