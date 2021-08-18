/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Request model for creating an OpenID Connect IDP configuration
 */
@Schema(description = "Request model for creating an OpenID Connect IDP configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class CreateOpenIdIdpConfigRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("authorizationEndPointUrl")
  private String authorizationEndPointUrl = null;

  @JsonProperty("tokenEndPointUrl")
  private String tokenEndPointUrl = null;

  @JsonProperty("userInfoEndPointUrl")
  private String userInfoEndPointUrl = null;

  @JsonProperty("jwksEndPointUrl")
  private String jwksEndPointUrl = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("scopes")
  private List<String> scopes = new ArrayList<>();

  @JsonProperty("redirectUris")
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("mappingClaim")
  private String mappingClaim = null;

  /**
   * &amp;#128640; Since v4.11.0  Flow, which is used at authentication
   */
  public enum FlowEnum {
    AUTHORIZATION_CODE("authorization_code"),
    HYBRID("hybrid");

    private String value;

    FlowEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static FlowEnum fromValue(String text) {
      for (FlowEnum b : FlowEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("flow")
  private FlowEnum flow = null;

  @JsonProperty("pkceEnabled")
  private Boolean pkceEnabled = false;

  @JsonProperty("pkceChallengeMethod")
  private String pkceChallengeMethod = "plain";

  @JsonProperty("fallbackMappingClaim")
  private String fallbackMappingClaim = null;

  /**
   * &amp;#128640; Since v4.23.0  Source, which is used to get user information at the import or update of a user.
   */
  public enum UserInfoSourceEnum {
    USER_INFO_ENDPOINT("user_info_endpoint"),
    ID_TOKEN("id_token");

    private String value;

    UserInfoSourceEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static UserInfoSourceEnum fromValue(String text) {
      for (UserInfoSourceEnum b : UserInfoSourceEnum.values()) {
        if (b.value.equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("userInfoSource")
  private UserInfoSourceEnum userInfoSource = null;

  @JsonProperty("userImportEnabled")
  private Boolean userImportEnabled = false;

  @JsonProperty("userImportGroup")
  private Long userImportGroup = null;

  @JsonProperty("userUpdateEnabled")
  private Boolean userUpdateEnabled = false;

  @JsonProperty("userManagementUrl")
  private String userManagementUrl = null;

  public CreateOpenIdIdpConfigRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the IDP
   * @return name
  **/
  @Schema(required = true, description = "Name of the IDP")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOpenIdIdpConfigRequest issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer identifier of the IDP  The value is a case sensitive URL.
   * @return issuer
  **/
  @Schema(required = true, description = "Issuer identifier of the IDP  The value is a case sensitive URL.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public CreateOpenIdIdpConfigRequest authorizationEndPointUrl(String authorizationEndPointUrl) {
    this.authorizationEndPointUrl = authorizationEndPointUrl;
    return this;
  }

   /**
   * URL of the authorization endpoint
   * @return authorizationEndPointUrl
  **/
  @Schema(required = true, description = "URL of the authorization endpoint")
  public String getAuthorizationEndPointUrl() {
    return authorizationEndPointUrl;
  }

  public void setAuthorizationEndPointUrl(String authorizationEndPointUrl) {
    this.authorizationEndPointUrl = authorizationEndPointUrl;
  }

  public CreateOpenIdIdpConfigRequest tokenEndPointUrl(String tokenEndPointUrl) {
    this.tokenEndPointUrl = tokenEndPointUrl;
    return this;
  }

   /**
   * URL of the token endpoint
   * @return tokenEndPointUrl
  **/
  @Schema(required = true, description = "URL of the token endpoint")
  public String getTokenEndPointUrl() {
    return tokenEndPointUrl;
  }

  public void setTokenEndPointUrl(String tokenEndPointUrl) {
    this.tokenEndPointUrl = tokenEndPointUrl;
  }

  public CreateOpenIdIdpConfigRequest userInfoEndPointUrl(String userInfoEndPointUrl) {
    this.userInfoEndPointUrl = userInfoEndPointUrl;
    return this;
  }

   /**
   * URL of the user info endpoint
   * @return userInfoEndPointUrl
  **/
  @Schema(required = true, description = "URL of the user info endpoint")
  public String getUserInfoEndPointUrl() {
    return userInfoEndPointUrl;
  }

  public void setUserInfoEndPointUrl(String userInfoEndPointUrl) {
    this.userInfoEndPointUrl = userInfoEndPointUrl;
  }

  public CreateOpenIdIdpConfigRequest jwksEndPointUrl(String jwksEndPointUrl) {
    this.jwksEndPointUrl = jwksEndPointUrl;
    return this;
  }

   /**
   * URL of the JWKS endpoint
   * @return jwksEndPointUrl
  **/
  @Schema(required = true, description = "URL of the JWKS endpoint")
  public String getJwksEndPointUrl() {
    return jwksEndPointUrl;
  }

  public void setJwksEndPointUrl(String jwksEndPointUrl) {
    this.jwksEndPointUrl = jwksEndPointUrl;
  }

  public CreateOpenIdIdpConfigRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * ID of the OpenID client
   * @return clientId
  **/
  @Schema(required = true, description = "ID of the OpenID client")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CreateOpenIdIdpConfigRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Secret, which client uses at authentication.
   * @return clientSecret
  **/
  @Schema(required = true, description = "Secret, which client uses at authentication.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public CreateOpenIdIdpConfigRequest scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public CreateOpenIdIdpConfigRequest addScopesItem(String scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * List of requested scopes
   * @return scopes
  **/
  @Schema(required = true, description = "List of requested scopes")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public CreateOpenIdIdpConfigRequest redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public CreateOpenIdIdpConfigRequest addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * URIs, to which a user is redirected after authorization.
   * @return redirectUris
  **/
  @Schema(required = true, description = "URIs, to which a user is redirected after authorization.")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public CreateOpenIdIdpConfigRequest mappingClaim(String mappingClaim) {
    this.mappingClaim = mappingClaim;
    return this;
  }

   /**
   * Name of the claim which is used for the user mapping.
   * @return mappingClaim
  **/
  @Schema(required = true, description = "Name of the claim which is used for the user mapping.")
  public String getMappingClaim() {
    return mappingClaim;
  }

  public void setMappingClaim(String mappingClaim) {
    this.mappingClaim = mappingClaim;
  }

  public CreateOpenIdIdpConfigRequest flow(FlowEnum flow) {
    this.flow = flow;
    return this;
  }

   /**
   * &amp;#128640; Since v4.11.0  Flow, which is used at authentication
   * @return flow
  **/
  @Schema(description = "&#128640; Since v4.11.0  Flow, which is used at authentication")
  public FlowEnum getFlow() {
    return flow;
  }

  public void setFlow(FlowEnum flow) {
    this.flow = flow;
  }

  public CreateOpenIdIdpConfigRequest pkceEnabled(Boolean pkceEnabled) {
    this.pkceEnabled = pkceEnabled;
    return this;
  }

   /**
   * Determines whether PKCE is enabled.  cf. [RFC 7636](https://tools.ietf.org/html/rfc7636)
   * @return pkceEnabled
  **/
  @Schema(description = "Determines whether PKCE is enabled.  cf. [RFC 7636](https://tools.ietf.org/html/rfc7636)")
  public Boolean isPkceEnabled() {
    return pkceEnabled;
  }

  public void setPkceEnabled(Boolean pkceEnabled) {
    this.pkceEnabled = pkceEnabled;
  }

  public CreateOpenIdIdpConfigRequest pkceChallengeMethod(String pkceChallengeMethod) {
    this.pkceChallengeMethod = pkceChallengeMethod;
    return this;
  }

   /**
   * PKCE code challenge method.  cf. [RFC 7636](https://tools.ietf.org/html/rfc7636)
   * @return pkceChallengeMethod
  **/
  @Schema(description = "PKCE code challenge method.  cf. [RFC 7636](https://tools.ietf.org/html/rfc7636)")
  public String getPkceChallengeMethod() {
    return pkceChallengeMethod;
  }

  public void setPkceChallengeMethod(String pkceChallengeMethod) {
    this.pkceChallengeMethod = pkceChallengeMethod;
  }

  public CreateOpenIdIdpConfigRequest fallbackMappingClaim(String fallbackMappingClaim) {
    this.fallbackMappingClaim = fallbackMappingClaim;
    return this;
  }

   /**
   * Name of the claim which is used for the user mapping fallback.
   * @return fallbackMappingClaim
  **/
  @Schema(description = "Name of the claim which is used for the user mapping fallback.")
  public String getFallbackMappingClaim() {
    return fallbackMappingClaim;
  }

  public void setFallbackMappingClaim(String fallbackMappingClaim) {
    this.fallbackMappingClaim = fallbackMappingClaim;
  }

  public CreateOpenIdIdpConfigRequest userInfoSource(UserInfoSourceEnum userInfoSource) {
    this.userInfoSource = userInfoSource;
    return this;
  }

   /**
   * &amp;#128640; Since v4.23.0  Source, which is used to get user information at the import or update of a user.
   * @return userInfoSource
  **/
  @Schema(description = "&#128640; Since v4.23.0  Source, which is used to get user information at the import or update of a user.")
  public UserInfoSourceEnum getUserInfoSource() {
    return userInfoSource;
  }

  public void setUserInfoSource(UserInfoSourceEnum userInfoSource) {
    this.userInfoSource = userInfoSource;
  }

  public CreateOpenIdIdpConfigRequest userImportEnabled(Boolean userImportEnabled) {
    this.userImportEnabled = userImportEnabled;
    return this;
  }

   /**
   * Determines if a DRACOON account is automatically created for a new user  who successfully logs on with his / her AD / IDP account.
   * @return userImportEnabled
  **/
  @Schema(description = "Determines if a DRACOON account is automatically created for a new user  who successfully logs on with his / her AD / IDP account.")
  public Boolean isUserImportEnabled() {
    return userImportEnabled;
  }

  public void setUserImportEnabled(Boolean userImportEnabled) {
    this.userImportEnabled = userImportEnabled;
  }

  public CreateOpenIdIdpConfigRequest userImportGroup(Long userImportGroup) {
    this.userImportGroup = userImportGroup;
    return this;
  }

   /**
   * User group that is assigned to users who are created by automatic import.  Reset with &#x60;0&#x60;
   * @return userImportGroup
  **/
  @Schema(description = "User group that is assigned to users who are created by automatic import.  Reset with `0`")
  public Long getUserImportGroup() {
    return userImportGroup;
  }

  public void setUserImportGroup(Long userImportGroup) {
    this.userImportGroup = userImportGroup;
  }

  public CreateOpenIdIdpConfigRequest userUpdateEnabled(Boolean userUpdateEnabled) {
    this.userUpdateEnabled = userUpdateEnabled;
    return this;
  }

   /**
   * Determines if the DRACOON account is updated with data from AD / IDP.  For OpenID Connect, the scopes &#x60;email&#x60; and &#x60;profile&#x60; are needed.
   * @return userUpdateEnabled
  **/
  @Schema(description = "Determines if the DRACOON account is updated with data from AD / IDP.  For OpenID Connect, the scopes `email` and `profile` are needed.")
  public Boolean isUserUpdateEnabled() {
    return userUpdateEnabled;
  }

  public void setUserUpdateEnabled(Boolean userUpdateEnabled) {
    this.userUpdateEnabled = userUpdateEnabled;
  }

  public CreateOpenIdIdpConfigRequest userManagementUrl(String userManagementUrl) {
    this.userManagementUrl = userManagementUrl;
    return this;
  }

   /**
   * URL of the user management UI.  Use empty string to remove.
   * @return userManagementUrl
  **/
  @Schema(description = "URL of the user management UI.  Use empty string to remove.")
  public String getUserManagementUrl() {
    return userManagementUrl;
  }

  public void setUserManagementUrl(String userManagementUrl) {
    this.userManagementUrl = userManagementUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOpenIdIdpConfigRequest createOpenIdIdpConfigRequest = (CreateOpenIdIdpConfigRequest) o;
    return Objects.equals(this.name, createOpenIdIdpConfigRequest.name) &&
        Objects.equals(this.issuer, createOpenIdIdpConfigRequest.issuer) &&
        Objects.equals(this.authorizationEndPointUrl, createOpenIdIdpConfigRequest.authorizationEndPointUrl) &&
        Objects.equals(this.tokenEndPointUrl, createOpenIdIdpConfigRequest.tokenEndPointUrl) &&
        Objects.equals(this.userInfoEndPointUrl, createOpenIdIdpConfigRequest.userInfoEndPointUrl) &&
        Objects.equals(this.jwksEndPointUrl, createOpenIdIdpConfigRequest.jwksEndPointUrl) &&
        Objects.equals(this.clientId, createOpenIdIdpConfigRequest.clientId) &&
        Objects.equals(this.clientSecret, createOpenIdIdpConfigRequest.clientSecret) &&
        Objects.equals(this.scopes, createOpenIdIdpConfigRequest.scopes) &&
        Objects.equals(this.redirectUris, createOpenIdIdpConfigRequest.redirectUris) &&
        Objects.equals(this.mappingClaim, createOpenIdIdpConfigRequest.mappingClaim) &&
        Objects.equals(this.flow, createOpenIdIdpConfigRequest.flow) &&
        Objects.equals(this.pkceEnabled, createOpenIdIdpConfigRequest.pkceEnabled) &&
        Objects.equals(this.pkceChallengeMethod, createOpenIdIdpConfigRequest.pkceChallengeMethod) &&
        Objects.equals(this.fallbackMappingClaim, createOpenIdIdpConfigRequest.fallbackMappingClaim) &&
        Objects.equals(this.userInfoSource, createOpenIdIdpConfigRequest.userInfoSource) &&
        Objects.equals(this.userImportEnabled, createOpenIdIdpConfigRequest.userImportEnabled) &&
        Objects.equals(this.userImportGroup, createOpenIdIdpConfigRequest.userImportGroup) &&
        Objects.equals(this.userUpdateEnabled, createOpenIdIdpConfigRequest.userUpdateEnabled) &&
        Objects.equals(this.userManagementUrl, createOpenIdIdpConfigRequest.userManagementUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, issuer, authorizationEndPointUrl, tokenEndPointUrl, userInfoEndPointUrl, jwksEndPointUrl, clientId, clientSecret, scopes, redirectUris, mappingClaim, flow, pkceEnabled, pkceChallengeMethod, fallbackMappingClaim, userInfoSource, userImportEnabled, userImportGroup, userUpdateEnabled, userManagementUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOpenIdIdpConfigRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    authorizationEndPointUrl: ").append(toIndentedString(authorizationEndPointUrl)).append("\n");
    sb.append("    tokenEndPointUrl: ").append(toIndentedString(tokenEndPointUrl)).append("\n");
    sb.append("    userInfoEndPointUrl: ").append(toIndentedString(userInfoEndPointUrl)).append("\n");
    sb.append("    jwksEndPointUrl: ").append(toIndentedString(jwksEndPointUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    mappingClaim: ").append(toIndentedString(mappingClaim)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    pkceEnabled: ").append(toIndentedString(pkceEnabled)).append("\n");
    sb.append("    pkceChallengeMethod: ").append(toIndentedString(pkceChallengeMethod)).append("\n");
    sb.append("    fallbackMappingClaim: ").append(toIndentedString(fallbackMappingClaim)).append("\n");
    sb.append("    userInfoSource: ").append(toIndentedString(userInfoSource)).append("\n");
    sb.append("    userImportEnabled: ").append(toIndentedString(userImportEnabled)).append("\n");
    sb.append("    userImportGroup: ").append(toIndentedString(userImportGroup)).append("\n");
    sb.append("    userUpdateEnabled: ").append(toIndentedString(userUpdateEnabled)).append("\n");
    sb.append("    userManagementUrl: ").append(toIndentedString(userManagementUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
