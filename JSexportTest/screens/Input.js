export default function Input({children}){

return ( ()=>{const input = document.createElement('input');
       	 input.setAttribute('placeholder' , children);return input})()


}