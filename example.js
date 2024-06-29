/* eslint-disable react/jsx-no-target-blank
import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
*/

const App= ()=>{
const fn = ()=>{
};
;
const count = [1,2,2];
const input = ( ()=>{const input = document.createElement('input');
	 input.setAttribute('placeholder' , "write here");return input})();
return Input(Object.assign({children:["textbefore ",...count,"textafter "].map((child)=>{
  							    if(child instanceof HTMLElement){
                                    return child.outerHTML
                                }else{
                                    return child
                                }
  							    }).join('\n')}));
}
export default App;
