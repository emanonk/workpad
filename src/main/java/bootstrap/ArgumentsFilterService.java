package bootstrap;

import java.util.List;

public interface ArgumentsFilterService {

    List<String> getInputArguments(String keyboardLine);

    List<String> removeCommandAndGetArgsAsList(List<String> args);

    public String removeCommandAndGetArgsAsString(List<String> args);
}
