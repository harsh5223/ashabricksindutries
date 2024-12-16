
document.querySelector('.contact-form').addEventListener('submit', function(e) {
    e.preventDefault();
    const name = document.querySelector('input[name="name"]').value;
    const email = document.querySelector('input[name="email"]').value;
    const message = document.querySelector('textarea[name="message"]').value;

    if (name && email && message) {
        alert('Your message has been sent!');
    } else {
        alert('Please fill out all fields.');
    }
});
// Show or hide the Back to Top button based on scroll position
window.onscroll = function () {
    const backToTopBtn = document.getElementById("backToTopBtn");
    if (document.body.scrollTop > 200 || document.documentElement.scrollTop > 200) {
        backToTopBtn.style.display = "block"; // Show the button
    } else {
        backToTopBtn.style.display = "none"; // Hide the button
    }
};

// Smooth scroll to the top when the button is clicked
function scrollToTop() {
    window.scrollTo({
        top: 0,
        behavior: "smooth",
    });
}
