import Data.DataProcessor;
import Models.GenericAbstractInterface;
import UserInput.CollectionType;
import UserInput.DataSourceType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: get userInputType and collectionType from user input
        var collectionType = CollectionType.HUMAN;
        var dataSourceType = DataSourceType.FILE;

        var dataProcessor = new DataProcessor(collectionType, dataSourceType);
        List<GenericAbstractInterface> items = dataProcessor.getList();
        items.forEach(System.out::println);
    }
}
