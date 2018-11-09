package luj.groovy

import spock.lang.Specification

class AutoCtorTest extends Specification {

  void setup() {
    // NOOP
  }

  def "AutoCtor:"() {
    when:
    def result = new Test('test')

    then:
    result._property == null
    result._field == 'test'
  }

  @AutoCtor
  class Test {

    String _property

    private String _field
  }
}
