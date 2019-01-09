package miraclefx.view_control;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import miraclefx.model.RandomList;

public class miracleController {

    @FXML
    private ComboBox<Integer> columns;

    @FXML
    private ComboBox<Integer> number;

    @FXML
    private Button generate;

    @FXML
    private Button quit;
    
    @FXML
    private TextArea slate;
    
    private ObservableList<Integer> boxNumber;
    private ObservableList<Integer> boxColumn;
	private int cols;
	private int iter;
	private RandomList listRandom;
	
    
    public void initialize() {
    	List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	boxNumber=FXCollections.observableList(num);
    	List<Integer> col=Arrays.asList(1,2,3,4,5,6,7,8);
    	boxColumn= FXCollections.observableList(col);
    	number.setItems(boxNumber);
    	number.getSelectionModel().select(5);
		columns.setItems(boxColumn);
		columns.getSelectionModel().select(0);
		listRandom=new RandomList();
		
    }

    @FXML
    void handleGenerate(ActionEvent event) {
    	iter= number.getValue();
	    cols= columns.getValue();
	    slate.clear();
       for(int i=0;i<cols;i++) {
    	   listRandom.createListSequence(iter, 1, 90);
    	   slate.appendText("\n"+listRandom.getList().toString());
    	   listRandom.clear();
       }
    }

    @FXML
    void handleQuit(ActionEvent event) {
         System.exit(0);
    }

}

