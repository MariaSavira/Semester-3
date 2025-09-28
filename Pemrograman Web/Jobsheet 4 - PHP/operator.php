<?php
$a = 10;
$b = 5;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;

echo "Tambah : $hasilTambah <br>";
echo "Kurang : $hasilKurang <br>";
echo "Kali : $hasilKali <br>";
echo "Bagi : $hasilBagi <br>";
echo "Sisa Bagi : $sisaBagi <br>";
echo "Pangkat : $pangkat <br>";

$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihKecil = $a < $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihBesarSama = $a >= $b;

echo "<br> $a == $b? ($hasilSama) <br>";
echo "$a != $b? ($hasilTidakSama) <br>";
echo "$a < $b? ($hasilLebihKecil) <br>";
echo "$a > $b? ($hasilLebihBesar) <br>";
echo "$a <= $b? ($hasilLebihKecilSama) <br>";
echo "$a >= $b? ($hasilLebihBesarSama) <br>";

$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;

echo "<br> $a && $b? ($hasilAnd) <br>";
echo "$a || $b? ($hasilOr) <br>";
echo "!$a? ($hasilNotA) <br>";
echo "!$b? ($hasilNotB) <br>";

$c = $a += $b;
$d = $a -= $b;
$e = $a *= $b;
$f = $a /= $b;
$g = $a %= $b;

echo "<br> \$a += \$b hasilnya $c <br>";
echo "\$a -= \$b hasilnya $d <br>";
echo "\$a *= \$b hasilnya $e <br>";
echo "\$a /= \$b hasilnya $f <br>";
echo "\$a %= \$b hasilnya $g <br>";

$hasilIdentik = $a === $b;
$hasilTidakIdentik = $a !== $b;

echo "<br> $a === $b? ($hasilIdentik) <br>";
echo "$a !== $b? ($hasilTidakIdentik) <br>";

$totalKursi = 45;
$kursiDitempati = 28;
$kursiKosong = ($totalKursi - $kursiDitempati) / $totalKursi * 100;

echo "<br>Jadi, saat ini kursi yang kosong adalah %$kursiKosong";
?>