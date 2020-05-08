package com.github.biconou.discogs

import ru.blizzed.discogsdb.DiscogsAuthData
import ru.blizzed.discogsdb.DiscogsDBApi
import ru.blizzed.discogsdb.params.DiscogsDBParams



fun main(args: Array<String>) {

    DiscogsDBApi.initialize(DiscogsAuthData("BIqHCSNxDnaIPhqCiZoc", "xYpdaTwFFISNXwMOlvuGVossTaRtnkHs"))

    println(searchArtist("The Beatles")?.id)

    val albumName = "The Beatles"

    val page = DiscogsDBApi.searchMaster(
            DiscogsDBParams.QUERY.of(albumName)
            ).execute()

    val master = DiscogsDBApi.getMasterRelease(page.content.get(0).id).execute()

    println("${master.uri}")
    println("${master.artists.get(0).name} - ${master.title} - ${master.year}")
    downloadCover(master)
}