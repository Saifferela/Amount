import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DuplicateFinderTest {

    List<String> words = List.of("Java", "JavaScript", "Python", "C", "Ruby", "Java");

    @Test
    void findAmount_IfNameMeetsTwice_return2() {

        long given = new DuplicateFinder(words).findAmount("Java");
        long expect = 2;

        assertThat(given).isEqualTo(expect);
    }

    @Test
    void findAmount_IfNameMeetsOnce_return1() {

        long given = new DuplicateFinder(words).findAmount("JavaScript");
        long expect = 1;

        assertThat(given).isEqualTo(expect);
    }

    @Test
    void findAmount_IfNameNotMeet_return0() {

        long given = new DuplicateFinder(words).findAmount("C++");
        long expect = 0;

        assertThat(given).isEqualTo(expect);
    }

    @Test
    void findAmount_ifNameIsEmpty_return0() {
        long given = new DuplicateFinder(words).findAmount("");
        long expect = 0;

        assertThat(given).isEqualTo(expect);
    }

    @Test
    void findAmount_ifNameIsNull_return0() {
        long given = new DuplicateFinder(words).findAmount(null);
        long expect = 0;

        assertThat(given).isEqualTo(expect);
    }
}