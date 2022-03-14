import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import '../styles/Navigation.scss'
import logo from '../images/logo.svg'

export default class Navigation extends Component {
    render() {
        return ( 
            
            
            <div className='nav'>
                
                    <Link>
                        <img src={logo} alt='logo image' className='nav-logo'/>
                    </Link>
                    <div>
                        <ul className='nav-list'>
                            <li className='list-item'>
                                <Link className='nav-link' to='/'>Home</Link>
                            </li>
                            <li className='list-item'>
                                <Link className='nav-link' to='/game'>Game</Link>
                            </li>
                            <li className='list-item'>
                                <Link className='nav-link' to='/rankings'>Rankings</Link>
                            </li>
                        </ul>
                    </div>
                
            </div>
            
            
        )
    }
}
