package uk.gov.nationalarchives;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

public class ProfileActions {
    //Tab Pane
    private TabPane profileTabPane;
    //Buttons
    private Button newProfileButton;
    private Button openProfileButton;
    private Button saveProfileButton;
    private Button exportProfileButton;
    //Menu Items
    private MenuItem newProfileMenuItem;
    private MenuItem openProfileMenuItem;
    private MenuItem saveProfileMenuItem;
    private MenuItem saveAsProfileMenuItem;
    private MenuItem exportProfileMenuItem;



    void construct(Button newProfileButton, Button openProfileButton, Button saveProfileButton,
                          Button exportProfileButton, MenuItem newProfileMenuItem, MenuItem openProfileMenuItem,
                          MenuItem saveProfileMenuItem, MenuItem saveAsProfileMenuItem, MenuItem exportProfileMenuItem,
                   TabPane profileTabPane) {

        this.newProfileButton = newProfileButton;
        this.openProfileButton = openProfileButton;
        this.saveProfileButton = saveProfileButton;
        this.exportProfileButton = exportProfileButton;

        this.newProfileMenuItem = newProfileMenuItem;
        this.openProfileMenuItem = openProfileMenuItem;
        this.saveProfileMenuItem = saveProfileMenuItem;
        this.saveAsProfileMenuItem = saveAsProfileMenuItem;
        this.exportProfileMenuItem = exportProfileMenuItem;

        this.profileTabPane = profileTabPane;

    }

    void outline() {
        newProfileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                profileTabPane.getTabs().add(cleanProfileTabInstance("Profile " + (profileTabPane.getTabs().size() +1)));
            }
        });
    }

    private Tab cleanProfileTabInstance(String profileName) {
        Tab profileTab = new Tab(profileName);
        TreeTableView profileTreeTableView = new TreeTableView();
        TreeTableColumn resource = new TreeTableColumn("Resource");
        TreeTableColumn extension = new TreeTableColumn("Extension");
        TreeTableColumn size = new TreeTableColumn("Size");
        TreeTableColumn lastModified = new TreeTableColumn("Last Modified");
        TreeTableColumn id = new TreeTableColumn("ID");
        TreeTableColumn format = new TreeTableColumn("Format");
        TreeTableColumn version = new TreeTableColumn("Version");
        TreeTableColumn mimeType = new TreeTableColumn("MIME Type");
        TreeTableColumn PUID = new TreeTableColumn("PUID");
        TreeTableColumn method = new TreeTableColumn("Method");
        TreeTableColumn hash = new TreeTableColumn("Hash");
        profileTreeTableView.getColumns().addAll(resource, extension, size, lastModified, id, format, version, mimeType, PUID, method, hash);
        profileTab.setContent(profileTreeTableView);
        return profileTab;
    }
}
