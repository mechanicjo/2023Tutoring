

public class Client {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Directory directory1 = new Directory("Directory1");

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        File file3 = new File("File3.txt");
        Directory directory2 = new Directory("Directory2");
        directory2.addComponent(file3);
        directory2.addComponent(directory1);

        directory2.showDetails();
    }
}