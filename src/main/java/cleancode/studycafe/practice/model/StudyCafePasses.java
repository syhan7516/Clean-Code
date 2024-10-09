package cleancode.studycafe.practice.model;

import java.util.List;

public class StudyCafePasses {

    private final List<StudyCafePass> passes;

    private StudyCafePasses(List<StudyCafePass> pass) {
        this.passes = pass;
    }

    public static StudyCafePasses of(List<StudyCafePass> passes) {
        return new StudyCafePasses(passes);
    }

    public List<StudyCafePass> findPassBy(StudyCafePassType studyCafePassType) {
        return passes.stream()
                .filter(studyCafePass -> studyCafePass.isSamePassType(studyCafePassType))
                .toList();
    }
}
