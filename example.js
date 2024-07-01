
import 'bootstrap/dist/css/bootstrap.min.css'
import 'jjj'
import react,{ reactLogo, useState } from './assets/react.svg'
import viteLogo from '/vite.svg'
 function fn ({images}){
console.log(images)
}
function ImageSlider ({images}){
return ( ()=>{const div = document.createElement('div');
	 div.appendChild(( ()=>{const ol = document.createElement('ol');
	 ol.insertAdjacentHTML('beforeend', (()=>{
  							const childText= (images.map(( _,index )=>( ( ()=>{const li = document.createElement('li');
	 li.setAttribute('key' , index);li.setAttribute('data-target' , "#carouselExampleIndicators");li.setAttribute('data-slide-to' , index);li.setAttribute('classname' , index === 0 ? ( 'active' ): ( '' ));return li})()
 )
));
  							if(childText instanceof HTMLElement){
  							    return childText.outerHTML
  							}else if(Array.isArray(childText)) {
              return childText.map(element => element.outerHTML);
            }else{
  							return childText
  							}
  								})()); ol.setAttribute('classname' , "carousel-indicators");return ol})()); div.appendChild(( ()=>{const div = document.createElement('div');
	 div.insertAdjacentHTML('beforeend', (()=>{
  							const childText= (images.map(( image,index )=>( ( ()=>{const div = document.createElement('div');
	 div.appendChild(( ()=>{const img = document.createElement('img');
	 img.setAttribute('src' , image);img.setAttribute('classname' , "d-block w-100");img.setAttribute('alt' , `Slide ${index + 1}`);return img})()); div.setAttribute('key' , index);div.setAttribute('classname' , `carousel-item ${index === 0 ? 'active' : ''}`);return div})()
 )
));
  							if(childText instanceof HTMLElement){
  							    return childText.outerHTML
  							}else if(Array.isArray(childText)) {
              return childText.map(element => element.outerHTML);
            }else{
  							return childText
  							}
  								})()); div.setAttribute('classname' , "carousel-inner");return div})()); div.appendChild(( ()=>{const a = document.createElement('a');
	 a.appendChild(( ()=>{const span = document.createElement('span');
	 span.setAttribute('classname' , "carousel-control-prev-icon");span.setAttribute('aria-hidden' , "true");return span})()); a.appendChild(( ()=>{const span = document.createElement('span');
	 span.insertAdjacentHTML('beforeend','Previous '); span.setAttribute('classname' , "sr-only");return span})()); a.setAttribute('classname' , "carousel-control-prev");a.setAttribute('href' , "#carouselExampleIndicators");a.setAttribute('role' , "button");a.setAttribute('data-slide' , "prev");return a})()); div.appendChild(( ()=>{const a = document.createElement('a');
	 a.appendChild(( ()=>{const span = document.createElement('span');
	 span.setAttribute('classname' , "carousel-control-next-icon");span.setAttribute('aria-hidden' , "true");return span})()); a.appendChild(( ()=>{const span = document.createElement('span');
	 span.insertAdjacentHTML('beforeend','Next '); span.setAttribute('classname' , "sr-only");return span})()); a.setAttribute('classname' , "carousel-control-next");a.setAttribute('href' , "#carouselExampleIndicators");a.setAttribute('role' , "button");a.setAttribute('data-slide' , "next");return a})()); div.setAttribute('id' , "carouselExampleIndicators");div.setAttribute('classname' , "carousel slide");div.setAttribute('data-ride' , "carousel");return div})()
}

export default ImageSlider;
