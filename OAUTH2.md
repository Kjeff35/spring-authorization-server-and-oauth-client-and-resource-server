# OAuth 2.0
OAuth 2.0 is an authorization framework that enables third-party applications to obtain limited access to a user's resources without exposing their credentials. The main components of OAuth 2.0 are:

## 1. Roles (Actors)
- Resource Owner (User): The entity that owns the protected resources (e.g., a user granting access to their data).
- Client (Third-Party Application): The application requesting access to the user’s resources.
- Authorization Server: The server that authenticates the user and issues access tokens after obtaining consent (e.g., Google, Facebook, GitHub OAuth servers).
- Resource Server: The server hosting the protected resources (e.g., Google Drive, Facebook profile data), which validates the access token before responding to requests.

## 2. Tokens
- Access Token: A short-lived credential used by the client to access protected resources on behalf of the user.
- Refresh Token (optional): A long-lived credential used to obtain a new access token when the current one expires.
- Authorization Code (used in Authorization Code flow): A temporary code exchanged for an access token.

## 3. Authorization Grant Types (Flows)
- OAuth 2.0 defines different ways (grant types) for a client to obtain an access token:
- Authorization Code Flow: Used by web apps (most secure, involves a code exchange).
- Implicit Flow (Deprecated): Previously used for single-page apps (SPAs), now replaced by PKCE.
- Resource Owner Password Credentials (ROPC): Direct username/password exchange (not recommended for third-party apps).
- Client Credentials Flow: For machine-to-machine authentication (no user involved).
- Device Authorization Flow: For devices with limited input capabilities (e.g., smart TVs).
- PKCE (Proof Key for Code Exchange): An extension to Authorization Code Flow for public clients (mobile/native apps).

## 4. Endpoints
- Authorization Endpoint: Where the user grants permission (redirects to a consent screen).
- Token Endpoint: Where the client exchanges an authorization code or credentials for tokens.
- Redirection (Callback) Endpoint: Where the authorization server sends the user after granting permission.

## 5. Scopes & Permissions
- Scopes: Define the level of access the client requests (e.g., read:profile, write:files).
- Consent Screen: The UI where the user approves or denies the requested scopes.

## 6. Additional Security Features
- State Parameter: Prevents CSRF attacks by binding the request to a session.
- PKCE (Proof Key for Code Exchange): Protects against authorization code interception.
- Token Expiry & Revocation: Ensures tokens are short-lived and can be invalidated.

Summary
OAuth 2.0 works by delegating authorization through tokens, allowing secure access to APIs without sharing passwords. The framework is widely used in modern authentication systems (e.g., Google, Facebook, GitHub logins).