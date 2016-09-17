package main.usu.MatcherComponents;

import java.util.ArrayList;
import java.util.List;

public class MatchStrategiesList {
    private List<MatchStrategy> matchStrategyList;

    public List<MatchStrategy> create() {
        matchStrategyList = new ArrayList<MatchStrategy>();
        matchStrategyList.add(new MatchAnyUniqueIdAndBirthDate());
        matchStrategyList.add(new MatchBirthDateAndName());
        matchStrategyList.add(new MatchPhoneNumberAndAnyUniqueId());
        matchStrategyList.add(new MatchPhoneNumberAndBirthDate());
        matchStrategyList.add(new MatchMothersNameCountyAndBirthDate());
        return matchStrategyList;
    }
}
