package com.example.bajp1.utils

import com.example.bajp1.data.MovieEntity

object DummyData {

    fun generateMovie(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity(
                "mv0", "Welcome to Sudden Death", "68%", "Action, Drama, Thriller",
                "Jesse Freeman is a former special forces officer and explosives expert now working a regular job as a security guard in a state-of-the-art basketball arena. Trouble erupts when a tech-savvy cadre of terrorists kidnap the team's owner and Jesse's daughter during opening night. Facing a ticking clock and impossible odds, it's up to Jesse to not only save them but also a full house of fans in this highly charged action thriller.",
                "https://image.tmdb.org/t/p/w1280/elZ6JCzSEvFOq4gNjNeZsnRFsvj.jpg",
                "2020", "1h 20m"
        ))

        movies.add(MovieEntity(
                "mv1", "Enola Holmes", "76%", "Crime, Drama, Mystery",
                "While searching for her missing mother, intrepid teen Enola Holmes uses her sleuthing skills to outsmart big brother Sherlock and help a runaway lord.",
                "https://image.tmdb.org/t/p/w1280/riYInlsq2kf1AWoGm80JQW5dLKp.jpg",
                "2020", "2h 3m"
        ))

        movies.add(MovieEntity(
                "mv2", "Mulan", "73%", "Action, Adventure, Drama, Fantasy",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "https://image.tmdb.org/t/p/w1280/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                "2020", "1h 55m"
        ))

        movies.add(MovieEntity(
                "mv3", "Money Plane", "61%", "Action",
                "A professional thief with \$40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
                "https://image.tmdb.org/t/p/w1280/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
                "2020", "1h 22m"
        ))

        movies.add(MovieEntity(
                "mv4", "1917", "79%", "War, Drama, Action, History",
                "At the height of the First World War, two young British soldiers must cross enemy territory and deliver a message that will stop a deadly attack on hundreds of soldiers.",
                "https://image.tmdb.org/t/p/w1280/iZf0KyrE25z1sage4SYFLCCrMi9.jpg",
                "2019", "1h 59m"
        ))

        movies.add(MovieEntity(
                "mv5", "Terminator: Dark Fate", "65%", "Action, Adventure, Science Fiction",
                "Decades after Sarah Connor prevented Judgment Day, a lethal new Terminator is sent to eliminate the future leader of the resistance. In a fight to save mankind, battle-hardened Sarah Connor teams up with an unexpected ally and an enhanced super soldier to stop the deadliest Terminator yet.",
                "https://image.tmdb.org/t/p/w1280/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "2019", "2h 8m"
        ))

        movies.add(MovieEntity(
                "mv6", "John Wick: Chapter 3 - Parabellum", "74%", "Action, Thriller, Crime",
                "Super-assassin John Wick returns with a \$14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.",
                "https://image.tmdb.org/t/p/w1280/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg",
                "2019", "2h 11m"
        ))

        movies.add(MovieEntity(
                "mv7", "Avengers: Endgame", "83%", "Adventure, Science Fiction, Action",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                "https://image.tmdb.org/t/p/w1280/or06FN3Dka5tukK1e9sl16pB3iy.jpg",
                "2019", "3h 1m"
        ))

        movies.add(MovieEntity(
                "mv8", "Spider-Man: Into the Spider-Verse", "84%", "Action, Adventure, Animation, Science Fiction, Comedy",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "https://image.tmdb.org/t/p/w1280/3cZn1k8x0bikrDKEy9ZKJ6Vdj30.jpg",
                "2018", "1h 57m"
        ))

        movies.add(MovieEntity(
                "mv9", "Avengers: Infinity War", "83%", "Adventure, Action, Science Fiction",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "https://image.tmdb.org/t/p/w1280/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "2018", "2h 29m"
        ))

        return movies
    }
}