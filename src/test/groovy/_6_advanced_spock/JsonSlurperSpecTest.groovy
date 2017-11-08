package _6_advanced_spock

import groovy.json.JsonSlurper
import spock.lang.Specification

class JsonSlurperSpecTest extends Specification {

    def slurper = new JsonSlurper()

    def "should slurp json"() {
        given:
        def someJson = '''
        {
            "person":{
                "name": "Andrzej",
                "age": 22,
                "pets": ["dog", "cat"]
            }
        }
        '''

        when:
        def result = slurper.parseText someJson

        then:
        "Andrzej" == result.person.name
        22 == result.person.age
        ["dog", "cat"] == result.person.pets
    }
}
