package Data;

import Data.Strategies.AnimalDataStrategy;
import Data.Strategies.BarrelDataStrategy;
import Data.Strategies.HumanDataStrategy;
import Data.Strategies.ItemTypeStrategy;
import Models.GenericAbstractInterface;
import UserInput.CollectionType;
import UserInput.DataSourceType;

import java.util.List;

public class DataProcessor {
    private final DataSourceType dataSourceType;
    private ItemTypeStrategy itemTypeStrategy;

    public DataProcessor(CollectionType collectionType, DataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType;

        switch (collectionType) {
            case HUMAN -> {
                itemTypeStrategy = new HumanDataStrategy();
            }
            case ANIMAL -> {
                itemTypeStrategy = new AnimalDataStrategy();
            }
            case BARREL -> {
                itemTypeStrategy = new BarrelDataStrategy();
            }
        }
    }

    public List<GenericAbstractInterface> getList() {
        return itemTypeStrategy.getCollection(dataSourceType);
    }
}
