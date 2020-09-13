package bootstrap;


;

import exception.InvalidNumberOfArgumentsException;

import java.util.*;

public class ArgumentsFilterServiceImpl implements ArgumentsFilterService {

    private static final int COMMAND_INDEX = 0;
    private static final String WHITE_SPACE = "\\s+";

    public List<String> getInputArguments(String keyboardLine) {
        if (Objects.isNull(keyboardLine) || keyboardLine.isEmpty()) {
            throw new InvalidNumberOfArgumentsException();
        }
        return Arrays.asList(keyboardLine.split(WHITE_SPACE));
    }

    public List<String> removeCommandAndGetArgsAsList(List<String> args) {
        if (Objects.isNull(args)) {
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>(args);
        list.remove(COMMAND_INDEX);
        return list;
    }

    public String removeCommandAndGetArgsAsString(List<String> args) {
        if (Objects.isNull(args)) {
            return "";
        }
        List<String> list = new ArrayList<>(args);
        list.remove(COMMAND_INDEX);
        return String.join(" ",list);

    }
}
