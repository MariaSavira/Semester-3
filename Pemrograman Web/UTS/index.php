<?php
$host = 'localhost';
$port = '5432';
$dbname = 'learnhub_database';
$user = 'postgres';
$pass = '12345';

$conn = pg_connect("host=$host port=$port dbname=$dbname user=$user password=$pass");
if (!$conn) {
    die('Koneksi gagal: ' . pg_last_error());
}

pg_set_client_encoding($conn, 'UTF8');

$sql = 'SELECT id_kategori, nama_kategori, deskripsi, tingkat_kesulitan, "status" from kategori ORDER BY id_kategori';
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
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="css/indexPHP.css">
    <link rel="icon" type="images/x-icon" href="assets/logo/web-logo.png" />
    <title>Daftar Kategori</title>
</head>

<body>
    <h1></h1>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>No.</th>
            <th>ID Kategori</th>
            <th>Nama Kategori</th>
            <th>Deskripsi</th>
            <th>Tingkat Kesusahan</th>
            <th>Status</th>
        </tr>
        <?php $i = 1;
        while ($row = pg_fetch_assoc($result)): ?>
            <tr>
                <td><?= $i; ?></td>
                <td><?= htmlspecialchars($row["id_kategori"], ENT_QUOTES, 'UTF-8'); ?></td>
                <td><?= htmlspecialchars($row["nama_kategori"], ENT_QUOTES, 'UTF-8'); ?></td>
                <td><?= htmlspecialchars($row["deskripsi"], ENT_QUOTES, 'UTF-8'); ?></td>
                <td><?= htmlspecialchars($row["tingkat_kesulitan"], ENT_QUOTES, 'UTF-8'); ?></td>
                <td><?= htmlspecialchars($row["status"], ENT_QUOTES, 'UTF-8'); ?></td>
                <td>
                    <a href="edit.php?nim=<?= urlencode($row["id_kategori"]) ?>">Edit</a> |
                    <a href="hapus.php?nim=<?= urlencode($row["id_kategori"]) ?>">Hapus</a>
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