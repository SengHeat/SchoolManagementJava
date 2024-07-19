import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class StudentTableApp extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public StudentTableApp() {
        super("Student Data Table");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize table model with column names
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "Name", "Age", "Grade"});

        // Create JTable with the tableModel
        table = new JTable(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);

        // Add JScrollPane to hold the JTable
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Load sample data
        loadSampleData();

        setVisible(true);
    }

    private void loadSampleData() {
        // Example: Load sample data into the table
        ArrayList<StudentModel> sampleData = createSampleData();
        for (StudentModel student : sampleData) {
            tableModel.addRow(new Object[]{student.getId(), student.getName(), student.getAge(), student.getGrade()});
        }
    }

    private ArrayList<StudentModel> createSampleData() {
        // Example: Create sample data for demonstration
        ArrayList<StudentModel> data = new ArrayList<>();
        data.add(new StudentModel(1, "John Doe", 20, "A"));
        data.add(new StudentModel(2, "Jane Smith", 22, "B"));
        data.add(new StudentModel(3, "Michael Johnson", 21, "A+"));
        return data;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentTableApp::new);
    }
}

// Example StudentModel class
class StudentModel {
    private int id;
    private String name;
    private int age;
    private String grade;

    public StudentModel(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
}

