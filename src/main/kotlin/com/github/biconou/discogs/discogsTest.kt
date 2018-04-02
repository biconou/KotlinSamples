package com.github.biconou.discogs

import ru.blizzed.discogsdb.DiscogsAuthData
import ru.blizzed.discogsdb.DiscogsDBApi
import ru.blizzed.discogsdb.params.DiscogsDBParams


fun main(args: Array<String>) {

    DiscogsDBApi.initialize(DiscogsAuthData("BIqHCSNxDnaIPhqCiZoc", "xYpdaTwFFISNXwMOlvuGVossTaRtnkHs"))

    val userInput = "korn"

    val page = DiscogsDBApi.searchArtist(
            DiscogsDBParams.QUERY.of(userInput)
            ).execute()

    val kornId = page.getContent().get(0).getId()

    val korn = DiscogsDBApi.getArtist(kornId).execute()

    print(kornId)


}