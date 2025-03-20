package Data.Strategies;

import Models.GenericAbstractInterface;
import UserInput.DataSourceType;

import java.util.List;

public interface ItemTypeStrategy {
    List<GenericAbstractInterface> getCollection(DataSourceType sourceType);
}
