package ClassRelationships;

// Kelas dasar (superclass) Person
class Person {
    private String name; // atribut nama hanya bisa diakses melalui getter/setter

    // Konstruktor untuk inisialisasi nama
    public Person(String name) {
        this.name = name;
    }

    // Getter untuk mengambil nilai nama
    public String getName() {
        return name;
    }
}

// Kelas Employee mewarisi (inheritance) dari Person
class Employee extends Person {
    // Konstruktor memanggil konstruktor superclass (Person)
    public Employee(String name) {
        super(name);
    }
}

// Kelas Project memiliki hubungan asosiasi dengan Employee
// Artinya, Project "terhubung" dengan Employee tetapi tidak bergantung sepenuhnya padanya
class Project {
    private String projectName; // nama proyek
    private Employee leader;    // objek Employee sebagai pemimpin proyek

    // Konstruktor untuk inisialisasi nama proyek dan leader
    public Project(String projectName, Employee leader) {
        this.projectName = projectName;
        this.leader = leader;
    }

    // Mengambil nama pemimpin proyek (asosiasi)
    public String getLeaderName() {
        return leader.getName();
    }
}

// Kelas Manager juga merupakan turunan (inheritance) dari Person
class Manager extends Person {
    private Task task; // atribut untuk komposisi (task melekat pada manager)

    // Konstruktor memanggil konstruktor superclass
    public Manager(String name) {
        super(name);
    }

    // Method untuk menetapkan task (komposisi)
    public void setTask(Task task) {
        this.task = task;
    }

    // Mengambil nama task
    public String getTaskName() {
        return task.getTaskName();
    }
}

// Kelas Department memiliki hubungan agregasi dengan Manager
// Artinya, Department "memiliki" Manager tetapi keduanya bisa eksis secara independen
class Department {
    private String deptName; // nama departemen
    private Manager manager; // objek Manager

    // Konstruktor untuk inisialisasi nama departemen
    public Department(String deptName) {
        this.deptName = deptName;
    }

    // Method untuk menetapkan manager ke departemen
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // Mengambil nama manager (agregasi)
    public String getManagerName() {
        return manager.getName();
    }
}

// Kelas Task merupakan bagian dari komposisi Manager
// Jika Manager dihapus, maka Task juga ikut hilang (tergantung secara penuh)
class Task {
    private String taskName; // nama tugas

    // Konstruktor untuk inisialisasi task
    public Task(String taskName) {
        this.taskName = taskName;
    }

    // Getter untuk mengambil nama task
    public String getTaskName() {
        return taskName;
    }
}
