import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import  'jjj'


import react,{reactLogo,useState} from './assets/react.svg'

import viteLogo from '/vite.svg'



function fn({images}){
console.log(images)
}



function ImageSlider  ( {images} ) {
  return (
    <div id="carouselExampleIndicators" className="carousel slide" data-ride="carousel">
      <ol className="carousel-indicators">
        {images.map((_, index) => (
          <li
            key={index}
            data-target="#carouselExampleIndicators"
            data-slide-to={index}
            className={index === 0 ? 'active' : ''}
          ></li>
        ))}
      </ol>
      <div className="carousel-inner">
        {images.map((image, index) => (
          <div key={index} className={`carousel-item ${index === 0 ? 'active' : ''}`}>
            <img src={image} className="d-block w-100" alt={`Slide ${index + 1}`} />
          </div>
        ))}
      </div>
      <a
        className="carousel-control-prev"
        href="#carouselExampleIndicators"
        role="button"
        data-slide="prev"
      >
        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
        <span className="sr-only">Previous</span>
      </a>
      <a
        className="carousel-control-next"
        href="#carouselExampleIndicators"
        role="button"
        data-slide="next"
      >
        <span className="carousel-control-next-icon" aria-hidden="true"></span>
        <span className="sr-only">Next</span>
      </a>
    </div>
  );
};

export default ImageSlider;
