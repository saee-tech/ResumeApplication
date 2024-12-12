@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap');

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins', sans-serif;
}

body {
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  background-image: url(https://th.bing.com/th/id/OIP.gGbv_UM5EIxpETEb2nTFFQHaEK?rs=1&pid=ImgDetMain);
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
}

section {
    position: relative;
    max-width: 500px; /* Adjust the max-width as needed */
    background-color: transparent;
    border: 2px solid rgba(255, 255, 255, 0.5);
    border-radius: 20px;
    backdrop-filter: blur(55px);
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 2rem 3rem;
    transition: all 0.5s ease-in-out;
  }


h1 {
  font-size: 2rem;
  color: #fff;
  text-align: center;
}
.inputbox {
    position: relative;
    margin: 20px 0;
    max-width: 550px;
    border-bottom: 2px solid #fff;
    transition: all 0.5s ease-in-out;
  }

  .inputbox input {
    width: 100%;
    height: 40px;
    background: transparent;
    border: none;
    outline: none;
    font-size: 1rem;
    padding: 0 35px 0 5px;
    color: #fff;
  }

  .inputbox ion-icon {
    position: absolute;
    right: 8px;
    color: #fff;
    font-size: 1.2rem;
    top: 12px;
    transition: all 0.5s ease-in-out;
  }


.inputbox label {
  position: absolute;
  top: 50%;
  left: 5px;
  transform: translateY(-50%);
  color: #fff;
  font-size: 1rem;
  pointer-events: none;
  transition: all 0.5s ease-in-out;
}

input:focus ~ label,
input:valid ~ label {
  top: -5px;
  font-size: 0.9rem;
  color: #a8a8a8;
}

button {
  width: 100%;
  height: 40px;
  border-radius: 40px;
  background-color: rgba(255, 255, 255, 1);
  border: none;
  outline: none;
  cursor: pointer;
  font-size: 1rem;
  font-weight: 600;
  transition: all 0.4s ease;
}

button:hover {
  background-color: rgba(255, 255, 255, 0.5);
}

.register {
  font-size: 0.9rem;
  color: #fff;
  text-align: center;
  margin: 25px 0 10px;
  transition: all 0.5s ease-in-out;
}

.register p a {
  text-decoration: none;
  color: #fff;
  font-weight: 600;
  transition: all 0.5s ease-in-out;
}

.register p a:hover {
  text-decoration: underline;
  color: #a8a8a8;
}