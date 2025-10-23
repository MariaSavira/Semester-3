document.addEventListener("DOMContentLoaded", function () {
  const navbar = document.getElementById("main-navbar");
  const scrollTrigger = window.innerHeight * 0.9;
  const logo = document.getElementById("navbar-logo");
  const oldPath = "assets/logo/LearnHub Light.png";
  const newPath = "assets/logo/LearnHub Dark.png";

  // Ganti navbar
  window.addEventListener("scroll", function () {
    if (window.scrollY >= scrollTrigger) {
      logo.src = newPath;
      navbar.classList.add("scrolled");
      navbar.classList.remove("navbar-initial");
    } else {
      logo.src = oldPath;
      navbar.classList.remove("scrolled");
      navbar.classList.add("navbar-initial");
    }
  });

  // Ganti slide
    const slidesContainer = document.querySelector(".slides"); 
    const slides = document.querySelectorAll(".slide");
    const dots = document.querySelectorAll(".dot");
    const totalSlides = slides.length;
    let currentSlide = 0;

    function showSlide(indexToShow) {
        const offset = -indexToShow * 100;
        
        if (slidesContainer) {
            slidesContainer.style.transform = `translateX(${offset / totalSlides}%)`;
        }

        dots.forEach((dot, i) => {
            dot.classList.toggle("active", i === indexToShow);
        });

        currentSlide = indexToShow;
    }
    
    window.currentSlide = function(n) {
        clearInterval(slideInterval);
        showSlide(n - 1);
        slideInterval = setInterval(nextSlide, 5000);
    }

    function nextSlide() {
        currentSlide = (currentSlide + 1) % totalSlides;
        showSlide(currentSlide);
    }

    let slideInterval = setInterval(nextSlide, 5000);
    
    showSlide(currentSlide);
});
