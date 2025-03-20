package Data.Strategies;

import Data.ViewModels.HumanViewModel;
import Models.GenericAbstractInterface;
import Models.Human;
import UserInput.DataSourceType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanDataStrategy implements ItemTypeStrategy {
    @Override
    public List<GenericAbstractInterface> getCollection(DataSourceType sourceType) {
        // получить коллекцию ViewModel из файла / рандома
        // смаппить и провести валидацию каждый объект Human
        // вернуть коллекцию

        // получить коллекцию ViewModel из файла / рандома / пользователя
        List<HumanViewModel> humanViewModels = new ArrayList<>(Arrays.asList(
                new HumanViewModel(1, 23, "last name from file"),
                new HumanViewModel(5, 16, "last name from file2"),
                new HumanViewModel(0, 45, "last name from file3"),
                new HumanViewModel(1, -5, "last name from file3")
        ));

        List<GenericAbstractInterface> humanItems = new ArrayList<>();
        for (var humanViewModel : humanViewModels) {
            var human = new Human();
            // смаппить и провести валидацию каждый объект Human
            // валидация происходит в сеттерах
            try {
                human.setGender(Human.Gender.values()[humanViewModel.getGenderCode()]);
                human.setAge(humanViewModel.getAge());
                human.setLastName(humanViewModel.getLastName());
            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                continue;
            }

            humanItems.add(human);
        }

        // вернуть коллекцию
        return humanItems;
    }
}
