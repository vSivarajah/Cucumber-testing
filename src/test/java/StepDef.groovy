import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^some precondition$/) { ->
    // Write code here that turns the phrase above into concrete actions
    SqlQueries sqlQueries = new SqlQueries()
    println sqlQueries.selectAllFromCars()
}
And(~/^some other precondition$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
When(~/^some action by the actor$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^some other action$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^yet another action$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^some testable outcome is achieved$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^something else we can check happens too$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}