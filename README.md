# IMDB
This Application fetches data from IMDB app in Rapidapi after making a post call with below request.

Header:
"X-RapidAPI-Key", "018091f65dmsh7829daea25712e7p16665bjsn77e0fb1ac5af"
"X-RapidAPI-Host", "imdb188.p.rapidapi.com"

Request:
{
    "country": {
        "anyPrimaryCountries": [
            "IN"
        ]
    },
    "limit": 200,
    "releaseDate": {
        "releaseDateRange": {
            "end": "2029-12-31",
            "start": "1997-01-01"
        }
    },
    "userRatings": {
        "aggregateRatingRange": {
            "max": 10,
            "min": 9
        },
        "ratingsCountRange": {
            "min": 1000
        }
    },
    "genre": {
        "allGenreIds": [
            "Action"
        ]
    },
    "runtimes": {
        "runtimeRangeMinutes": {
            "max": 120,
            "min": 0
        }
    }
}

Response sample:
{
    "status": true,
    "message": "Success",
    "timestamp": 1702854086017,
    "data": {
        "pageInfo": {
            "hasNextPage": false,
            "endCursor": "eyJlc1Rva2VuIjpbIjI1MDQ4NSIsIjI1MDQ4NSIsInR0MjkyODQxMDMiXSwiZmlsdGVyIjoie1wiY29uc3RyYWludHNcIjp7XCJnZW5yZUNvbnN0cmFpbnRcIjp7XCJhbGxHZW5yZUlkc1wiOltcIkFjdGlvblwiXX0sXCJvcmlnaW5Db3VudHJ5Q29uc3RyYWludFwiOntcImFueVByaW1hcnlDb3VudHJpZXNcIjpbXCJJTlwiXX0sXCJyZWxlYXNlRGF0ZUNvbnN0cmFpbnRcIjp7XCJyZWxlYXNlRGF0ZVJhbmdlXCI6e1wiZW5kXCI6XCIyMDI5LTEyLTMxXCIsXCJzdGFydFwiOlwiMTk5Ny0wMS0wMVwifX0sXCJydW50aW1lQ29uc3RyYWludFwiOnt9LFwidGl0bGVUeXBlQ29uc3RyYWludFwiOntcImFueVRpdGxlVHlwZUlkc1wiOltcIm1vdmllXCIsXCJzaG9ydFwiXX0sXCJ1c2VyUmF0aW5nc0NvbnN0cmFpbnRcIjp7XCJhZ2dyZWdhdGVSYXRpbmdSYW5nZVwiOntcIm1heFwiOjEwLFwibWluXCI6OX0sXCJyYXRpbmdzQ291bnRSYW5nZVwiOntcIm1pblwiOjEwMDB9fX0sXCJsYW5ndWFnZVwiOlwiZW4tVVNcIixcInNvcnRcIjp7XCJzb3J0QnlcIjpcIlBPUFVMQVJJVFlcIixcInNvcnRPcmRlclwiOlwiQVNDXCJ9LFwicmVzdWx0SW5kZXhcIjoxfSJ9",
            "total": 2
        },
        "list": [
            {
                "title": {
                    "id": "tt26999050",
                    "isAdult": false,
                    "canRateTitle": {
                        "isRatable": true
                    },
                    "originalTitleText": {
                        "text": "Ashtadigbandhanam"
                    },
                    "primaryImage": {
                        "id": "rm1182938113",
                        "imageUrl": "https://m.media-amazon.com/images/M/MV5BYTM4Y2YzNTAtNDg2Yy00YWZhLWI3MDYtMWM3YTdmMmI1OGNkXkEyXkFqcGdeQXVyNjUxNzk5NzU@._V1_.jpg",
                        "imageWidth": 3600,
                        "imageHeight": 5100
                    },
                    "ratingsSummary": {
                        "aggregateRating": 9.1,
                        "topRanking": null,
                        "voteCount": 2059
                    },
                    "releaseYear": {
                        "year": 2023,
                        "endYear": null
                    },
                    "titleEpisode": null,
                    "titleText": {
                        "text": "Ashtadigbandhanam"
                    },
                    "titleType": {
                        "id": "movie",
                        "text": "Movie",
                        "displayableProperty": {
                            "value": {
                                "plainText": ""
                            }
                        },
                        "categories": [
                            {
                                "id": "movie",
                                "text": "Movie",
                                "value": "movie"
                            }
                        ],
                        "canHaveEpisodes": false,
                        "isSeries": false,
                        "isEpisode": false
                    },
                    "series": null
                }
            },
            {
                "title": {
                    "id": "tt29284103",
                    "isAdult": false,
                    "canRateTitle": {
                        "isRatable": true
                    },
                    "originalTitleText": {
                        "text": "Nene Saroja"
                    },
                    "primaryImage": {
                        "id": "rm2255311361",
                        "imageUrl": "https://m.media-amazon.com/images/M/MV5BYTY2YTdjYWQtYjdiOS00NjNkLWJkMWUtMDBmN2E5NmE0MmEzXkEyXkFqcGdeQXVyMTcwMzY4NDkx._V1_.jpg",
                        "imageWidth": 709,
                        "imageHeight": 1004
                    },
                    "ratingsSummary": {
                        "aggregateRating": 9,
                        "topRanking": null,
                        "voteCount": 1025
                    },
                    "releaseYear": {
                        "year": 2023,
                        "endYear": null
                    },
                    "titleEpisode": null,
                    "titleText": {
                        "text": "Nene Saroja"
                    },
                    "titleType": {
                        "id": "movie",
                        "text": "Movie",
                        "displayableProperty": {
                            "value": {
                                "plainText": ""
                            }
                        },
                        "categories": [
                            {
                                "id": "movie",
                                "text": "Movie",
                                "value": "movie"
                            }
                        ],
                        "canHaveEpisodes": false,
                        "isSeries": false,
                        "isEpisode": false
                    },
                    "series": null
                }
            }
        ]
    }
}
