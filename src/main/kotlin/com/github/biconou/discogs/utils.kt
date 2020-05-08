package com.github.biconou.discogs

import ru.blizzed.discogsdb.DiscogsDBApi
import ru.blizzed.discogsdb.model.artist.Artist
import ru.blizzed.discogsdb.model.release.MasterRelease
import ru.blizzed.discogsdb.params.DiscogsDBParams
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths


fun downloadImage(url: String) {
    val input = URL(url).openStream()
    Files.copy(input, Paths.get("/home/remi/Téléchargements/tmp/cover.jpg"));
}


fun downloadCover(master: MasterRelease) {
    downloadImage("${master.images.get(0).uri}")
}

fun searchArtist(artistName: String): Artist? {
    val page = DiscogsDBApi.searchArtist(
            DiscogsDBParams.QUERY.of(artistName)
    ).execute()

    return DiscogsDBApi.getArtist(page.content.get(0).id).execute()
}
