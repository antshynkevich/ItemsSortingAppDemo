package Data.Strategies;

import Models.GenericAbstractInterface;
import UserInput.DataSourceType;

import java.util.List;

public class BarrelDataStrategy implements ItemTypeStrategy {

    @Override
    public List<GenericAbstractInterface> getCollection(DataSourceType sourceType) {
        return List.of();
    }
}
