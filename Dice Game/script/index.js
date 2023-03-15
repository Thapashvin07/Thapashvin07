function dicegameStart() {
  var randomInt1 = Math.random();
  randomInt1 = Math.floor(randomInt1 * 6) + 1;

  var randomInt2 = Math.random();
  randomInt2 = Math.floor(randomInt2 * 6) + 1;

  document
    .querySelector(".dice .img1")
    .setAttribute("src", "images/dice" + randomInt1 + ".png");
  document
    .querySelector(".dice .img2")
    .setAttribute("src", "images/dice" + randomInt2 + ".png");

  if (randomInt1 > randomInt2)
    document.querySelector(".container h1").textContent =
      "Player 1 is the winner🚩";
  else if (randomInt1 < randomInt2)
    document.querySelector(".container h1").textContent =
      "Player 2 is the winner🚩";
  else document.querySelector(".container h1").textContent = "Draw the Match🤝";
}
