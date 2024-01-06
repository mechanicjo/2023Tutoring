

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystem {
    private List<FileSystem> children = new ArrayList<FileSystem>();
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystem component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystem component : children) {
            component.showDetails();
        }
    }
}
