import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import logo from '../images/logo.svg'
import Navigation from '../components/Navigation'

export default class Home extends Component {
    render() {
        return (
            <>
            <Navigation/>
            <div className='home-page'>
                
                <h1>This is the home page!</h1>
                <Link to='/registration'>
                    <img src={logo}></img>
                </Link>
            </div>
            </>
        )
    }
}
