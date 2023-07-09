(function ($) {
    "use strict";

//Whatsapp Button
	$('.whatsappBtn').on("click", function(e){
		jQuery.ajax({
			type : "POST",
			url : "/api/v1/whatsapp/whatsapp_api",
			cache : false,
			async : false,
			data : {
				requestJSON : JSON.stringify()
			},
			success: function(){
				console.log("AJax Successfully worked");
			},
			error : function(){
				console.log("Error in ajax");
			}
		})
	});
	
	//Contact Us button 
	$('.btn-contactus , .btn-contact, .navbar-contact').on("click", function(e){
		jQuery.ajax({
			type : "GET",
			url : "/oofu/contact",
			cache : false,
			async : false,
			data : {
				requestJSON : JSON.stringify()
			},
			success: function(){
				window.location ="/oofu/contact";
				console.log("AJax Successfully worked");
			},
			error : function(){
				console.log("Error in ajax");
			}
		})
	});
	
	//Home Button
	
	$('.navbar-home').on("click", function(e){
		jQuery.ajax({
			type : "GET",
			url : "/oofu/home",
			cache : false,
			async : false,
			data : {
				requestJSON : JSON.stringify()
			},
			success: function(){
				window.location ="/oofu/home";
				console.log("AJax Successfully worked");
			},
			error : function(){
				console.log("Error in ajax");
			}
		})
	});
	
    // Spinner
    var spinner = function () {
        setTimeout(function () {
            if ($('#spinner').length > 0) {
                $('#spinner').removeClass('show');
            }
        }, 1);
    };
    spinner();
    
    
    // Initiate the wowjs
    new WOW().init();


    // Sticky Navbar
    $(window).scroll(function () {
        if ($(this).scrollTop() > 45) {
            $('.navbar').addClass('sticky-top shadow-sm');
        } else {
            $('.navbar').removeClass('sticky-top shadow-sm');
        }
    });
    
    
    // Dropdown on mouse hover
    const $dropdown = $(".dropdown");
    const $dropdownToggle = $(".dropdown-toggle");
    const $dropdownMenu = $(".dropdown-menu");
    const showClass = "show";
    
    $(window).on("load resize", function() {
        if (this.matchMedia("(min-width: 992px)").matches) {
            $dropdown.hover(
            function() {
                const $this = $(this);
                $this.addClass(showClass);
                $this.find($dropdownToggle).attr("aria-expanded", "true");
                $this.find($dropdownMenu).addClass(showClass);
            },
            function() {
                const $this = $(this);
                $this.removeClass(showClass);
                $this.find($dropdownToggle).attr("aria-expanded", "false");
                $this.find($dropdownMenu).removeClass(showClass);
            }
            );
        } else {
            $dropdown.off("mouseenter mouseleave");
        }
    });
    
    
    // Back to top button
    $(window).scroll(function () {
        if ($(this).scrollTop() > 100) {
            $('.back-to-top').fadeIn('slow');
        } else {
            $('.back-to-top').fadeOut('slow');
        }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({scrollTop: 0}, 1500, 'easeInOutExpo');
        return false;
    });


    // Testimonials carousel
    $(".testimonial-carousel").owlCarousel({
        autoplay: true,
        smartSpeed: 1000,
        margin: 25,
        dots: false,
        loop: true,
        center: true,
        responsive: {
            0:{
                items:1
            },
            576:{
                items:1
            },
            768:{
                items:2
            },
            992:{
                items:3
            }
        }
    });


    // Portfolio isotope and filter
    var portfolioIsotope = $('.portfolio-container').isotope({
        itemSelector: '.portfolio-item',
        layoutMode: 'fitRows'
    });
    $('#portfolio-flters li').on('click', function () {
        $("#portfolio-flters li").removeClass('active');
        $(this).addClass('active');

        portfolioIsotope.isotope({filter: $(this).data('filter')});
    });
    
})(jQuery);

