package uk.gov.nationalarchives;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import uk.gov.nationalarchives.droid.core.interfaces.config.RuntimeConfig;

public class Controller {
    // Tab pane for profiles
    public TabPane profileTabPane;

    // Toolbar Buttons
    public Button newProfileButton;
    public Button openProfileButton;
    public Button saveProfileButton;
    public Button exportProfileButton;
    public Button addItemButton;
    public Button removeItemButton;
    public Button startIdentificationButton;
    public Button pauseIdentificationButton;
    public Button filterButton;
    public CheckBox filterOnCheckBox;
    public Button reportButton;

    // Menu Buttons
    // - File
    public MenuItem newProfileMenuItem;
    public MenuItem openProfileMenuItem;
    public MenuItem saveProfileMenuItem;
    public MenuItem saveAsProfileMenuItem;
    public MenuItem exportProfileMenuItem;
    public MenuItem quitMenuItem;
    // - Edit
    public MenuItem addFileFoldersMenuItem;
    public MenuItem removeFileFoldersMenuItem;
    public MenuItem openContainingFoldersMenuItem;
    public MenuItem copyToClipboardMenuItem;
    public MenuItem expandMenuItem;
    public MenuItem expandThreeLevels;
    // - Run
    public MenuItem startIdentificationMenuItem;
    public MenuItem pauseIdentificationMenuItem;
    // - Filter
    public MenuItem filterOnMenuItem;
    public MenuItem editFilterMenuItem;
    public MenuItem copyFilterToAllMenuItem;
    // - Report
    public MenuItem generateReportMenuItem;
    // - Tools
    public MenuItem checkSignatureUpdatesMenuItem;
    public MenuItem installSignatureFileMenuItem;
    public MenuItem preferencesMenuItem;
    // - Help
    public MenuItem helpMenuItem;

    @FXML
    public void initialize() {
        ProfileActions profileAction = new ProfileActions();

        profileAction.construct(newProfileButton, openProfileButton, saveProfileButton, exportProfileButton,
                newProfileMenuItem, openProfileMenuItem, saveProfileMenuItem, saveAsProfileMenuItem, exportProfileMenuItem,
                profileTabPane);
        profileAction.outline();

        RuntimeConfig.configureRuntimeEnvironment();
    }


}
