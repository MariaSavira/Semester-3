<?php
$host = 'localhost';
$port = '5432';
$dbname = 'phpdatabase';
$user = 'postgres';
$pass = '12345';

$conn = pg_connect("host=$host port=$port dbname=$dbname user=$user password=$pass");
if (!$conn) {
  die('Koneksi gagal: ' . pg_last_error());
}

pg_set_client_encoding($conn, 'UTF8');

$sql = 'SELECT "Nim","Nama","Email","Jurusan" FROM "TB_Mahasiswa" ORDER BY "Nim"';
$result = pg_query($conn, $sql);
if (!$result) {
  die('Query gagal: ' . pg_last_error($conn));
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Daftar Mahasiswa</title>
</head>

<body>
  <h1>Daftar Mahasiswa</h1>
  <table border="1" cellpadding="10" cellspacing="0">
    <tr>
      <th>No.</th>
      <th>Nim</th>
      <th>Nama</th>
      <th>Email</th>
      <th>Jurusan</th>
      <th>Aksi</th>
    </tr>
    <?php $i = 1;
    while ($row = pg_fetch_assoc($result)): ?>
      <tr>
        <td><?= $i; ?></td>
        <td><?= htmlspecialchars($row["Nim"], ENT_QUOTES, 'UTF-8'); ?></td>
        <td><?= htmlspecialchars($row["Nama"], ENT_QUOTES, 'UTF-8'); ?></td>
        <td><?= htmlspecialchars($row["Email"], ENT_QUOTES, 'UTF-8'); ?></td>
        <td><?= htmlspecialchars($row["Jurusan"], ENT_QUOTES, 'UTF-8'); ?></td>
        <td>
          <a href="edit.php?nim=<?= urlencode($row["Nim"]) ?>">Edit</a> |
          <a href="hapus.php?nim=<?= urlencode($row["Nim"]) ?>">Hapus</a>
        </td>
      </tr>
    <?php $i++;
    endwhile; ?>
  </table>
</body>

</html>
<?php
pg_free_result($result);
pg_close($conn);
?>