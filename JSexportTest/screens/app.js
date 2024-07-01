/* eslint-disable react/jsx-no-target-blank
import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
*/
import Input from './Input.js'
const App= ()=>{


const images = [
  'https://via.placeholder.com/800x400?text=First+Slide',
  'https://via.placeholder.com/800x400?text=Second+Slide',
  'https://via.placeholder.com/800x400?text=Third+Slide',
];


return  Input(Object.assign({images:images}));}
export default App;
