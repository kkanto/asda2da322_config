 
listView('asda2da322 Jobs') {
    description('asda2da322 Jobs')
    jobs {
        regex('asda2da322_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
