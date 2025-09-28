<?php
#variabel yg dipakai untuk soal cerita 4.6
$nilaiSiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

#soal cerita 4.6
sort($nilaiSiswa);
$totalNilai = 0;

for ($i = 0; $i < count($nilaiSiswa); $i++){
    if ($i == 0 || $i == 1 || $i == 8 || $i == 9){
        continue;   
    }
    else {
        $totalNilai += $nilaiSiswa[$i];
    }
}

echo "Maka total nilainya adalah : $totalNilai";

#soal cerita 4.7
$hargaProduk = 120000;
$diskon = 0.2;
$hargaAkhir = 0;

if ($hargaProduk > 100000){
    $hargaAkhir = $hargaProduk - ($hargaProduk * $diskon);
}

echo "<br><br>Maka harga akhir yang harus dibayarkan adalah Rp$hargaAkhir";

#soal cerita 4.8
$totalSkor = [300, 600, 500];

echo "<br><br>";

$i = 0;
while ($i < count($totalSkor)){
    $skor = $totalSkor[$i];
    $hadiah = ($skor > 500) ? "YA" : "TIDAK";

    echo "Total skor pemain " . ($i + 1) . " adalah $skor<br>";
    echo "Apakah pemain mendapatkan hadiah tambahan? $hadiah<br><br>";

    $i++;
}

#soal cerita 5.4
$ujianMatematika = [
    ['Alice', 85],
    ['Bob', 92],
    ['Charlie', 78],
    ['David', 64],
    ['Eva', 90],
];

echo "Daftar nilai ujian matematika : <br>";

foreach ($ujianMatematika as $nilai){
    echo "Nama : $nilai[0], Nilai : $nilai[1]<br>";
};
?>