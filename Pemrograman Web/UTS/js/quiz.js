const listSoal = [
  {
    pertanyaan: "Apa kepanjangan dari HTML?",
    pilihan: [
      "Home Tool Markup Language",
      "Hyper Text Markup Language",
      "Hyperlinks and Text Markup Language",
      "Tidak Tau",
    ],
    jawaban: "Hyper Text Markup Language",
  },
  {
    pertanyaan: "Pilih heading terbesar dalam HTML!",
    pilihan: ["<h1>", "<h6>", "<head>", "<heading>"],
    jawaban: "<h1>",
  },
  {
    pertanyaan: "Pilih elemen yang benar untuk menulis teks penting!",
    pilihan: ["<important>", "<i>", "<strong>", "<b>"],
    jawaban: "<strong>",
  },
  {
    pertanyaan: "Mana karakter yang benar untuk menutup sebuah tag?",
    pilihan: ["*", "/", "^", "<"],
    jawaban: "/",
  },
  {
    pertanyaan: "Mana saja yang merupakan elemen dari tabel?",
    pilihan: [
      "<table><head><tfoot>",
      "<table><tr><tt>",
      "<thead><body><tr>",
      "<table><tr><td>",
    ],
    jawaban: "<table><tr><td>",
  },
];

const soal = document.getElementById("soal");
const pilihan = document.getElementById("pilihan");
const tombol = document.getElementById("next");
const timer = document.getElementById("timer");
const skor = document.getElementById("skor");
const skorInfo = document.getElementById("skor-info"); // ID baru
const progressText = document.getElementById("progress-text"); // ID baru
const timerDisplay = document.querySelector(".timer-display");

index = 0;
totalSkor = 0;
waktu = 5;
let timerJalan;

tombol.disabled = true;
tombol.style.opacity = 0.5;

tampilkanSoal();
mulaiTimer();

function tampilkanSoal() {
  soal.textContent = listSoal[index].pertanyaan;
  pilihan.innerHTML = "";

  if (progressText)
    progressText.textContent = `${index + 1}/${listSoal.length}`;
  if (skorInfo) skorInfo.textContent = `Skor: ${totalSkor}`;

  listSoal[index].pilihan.forEach((opsi) => {
    const btn = document.createElement("button");
    btn.textContent = opsi;
    console.log(btn.textContent);
    btn.className = "opsi";
    btn.onclick = function () {
      cekJawaban(opsi, btn);
      console.log(cekJawaban);
    };
    console.log(btn.onclick);
    pilihan.append(btn);
  });
}

function cekJawaban(opsiDipilih, tombol) {
  document.querySelectorAll(".opsi").forEach((btn) => (btn.disabled = true));
  if (opsiDipilih === listSoal[index].jawaban) {
    totalSkor++;
    tombol.style.backgroundColor = "lightgreen";
  } else {
    tombol.style.backgroundColor = "salmon";

    document.querySelectorAll(".opsi").forEach((btn) => {
      if (btn.textContent === listSoal[index].jawaban) {
        btn.style.backgroundColor = "lightgreen";
      }
    });
  }
  clearInterval(timerJalan);
  document.getElementById("next").disabled = false;
  document.getElementById("next").style.opacity = 1;
}

function lanjutSoal() {
  index++;

  if (index < listSoal.length) {
    tampilkanSoal();
    clearInterval(timerJalan);

    waktu = 5;
    mulaiTimer();

    tombol.disabled = true;
    tombol.style.opacity = 0.5;

  } else {
    soal.textContent = `Quiz Selesai! Skor kamu: ${totalSkor} dari ${listSoal.length}!`;
    pilihan.innerHTML = "";
    tombol.style.display = "none";
    timer.style.display = "none";
    timerDisplay.style.display = "none";
    document.querySelector(".skor-display").style.display = "none";
  }
}

function mulaiTimer() {
  timerJalan = setInterval(() => {
    timer.textContent = waktu;
    waktu--;

    if (waktu < 0) {
      clearInterval(timerJalan);
      lanjutSoal();
    }
  }, 1000);
}

tombol.addEventListener("click", () => {
  lanjutSoal();
});
