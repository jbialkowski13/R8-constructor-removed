package pl.whiter13.r8constructorremoved

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserResponse(
    @JsonProperty("name") val name: String,
    @JsonProperty("login") val login: String
)