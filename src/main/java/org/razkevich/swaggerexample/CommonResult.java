package org.razkevich.swaggerexample;


public enum CommonResult {

	SUCCESS(0, "Success"),
	ERROR(1, "Error"),
	OTP_EXPIRED(666, "Otp code expired"),
	WRONG_CONFIRM_CODE(888, "Wrong confirm code"),
	PASSWORD_INCORRECT(999, "Password incorrect"),
	UNKNOWN_ERROR(1000, "Unspecified error"),
	WRONG_PIN_ONCE(1001, "Wrong PIN once"),
	WRONG_PIN_WAIT(1002, "Wrong pin"),
	WRONG_PIN_BLOCK(1003, "Wrong pin"),
	MGUID_INCORRECT(1004, "Invalid Mguid"),
	USER_TEMP_BLOCKED(1005, "User is temporarily blocked"),
	SESSION_INVALID(1006, "Session doesn't exist or expired/closed"),
	SESSION_TIMEOUT(1007, "Session timed out"),
	DEVICE_BLOCKED(1008, "Device is blocked"),
	REG_LIMIT_REACHED(1009, "Reg code daily limit reached"),
	REG_CODE_ERROR(1010, "Reg code is incorrect"),
	REG_CODE_EXPIRED(1011, "Reg code has expired"),
	DEVICE_ALREADY_ACTIVE(1012, "Device already active"),
	DEVICE_LIMIT_REACHED(1013, "Device limit reached"),
	LOGIN_ID_NOT_EXISTS(1014, "Invalid login id"),
	MOB_CHANNEL_BLOCKED(1015, "Mobile channel is blocked"),
	USER_PERM_BLOCKED(1019, "User is permanently blocked"),
	MOBILE_CHANNEL_NOT_ACTIVE(1020, "Mobile channel is not activated"),
	DEVICE_INACTIVE(1021, "Device inactive"),
	NO_PHONE_NUMBER(1022, "No phone number attached to client record"),
	UNABLE_TO_COMPLETE_OPERATION(1023, "Unable to complete operation due to response from ESB service"),
	PRODUCT_ALIAS_DUPLICATE(1024, "The product alias has already been set for another product"),
	PRODUCT_UNAVAILABLE(1025, "Requested product has been hidden or closed"),
	TRANSFER_DETAILS_INVALID(1026, "Transfer details are invalid"),
	CHANNEL_LIMIT_EXCEEDED(1027, "Channel limit is exceeded"),
	INTERNET_CHANNEL_NOT_ACTIVE(1028, "Internet channel is not activated"),
	NO_PERS_MANAGER(1033, "The user doesn't have personal manager"),
	ANTI_FRAUD_BLOCK_USER(1035, "MCP blocks Mobile channel for the User"),
	ANTI_FRAUD_BLOCK_USER_PARAM(1035, "MCP blocks %s channel for the User"),
	ANTI_FRAUD_BLOCK_OPERATION(1036, "MCP blocks the operation for the User"),
	ANTI_FRAUD_REVIEW(1037, "MCP sends operation details to Call Centre"),
	TIMEOUT_ERROR(1038, "Back-end system is unavailable"),
	TRANSFER_TEMPLATE_NOT_FOUND(1039, "Transfer template was not found"),
	PRODUCT_NOT_FOUND(1040, "Product was not found"),
	MC_NOT_FOUND(1041, "The requested Mandate collection was not found"),
	CLIENT_NOT_FOUND(1042, "Client was not found"),
	SO_NOT_FOUND(1043, "Standing order was not found"),
	PO_NOT_FOUND(1044, "MCP was unable to find object"),
	PO_ALREADY_PROCESSED(1045, "Payment order already has status 'Processed'"),
	PO_ALREADY_CANCELLED(1046, "Payment order already has status 'Cancelled'"),
	PO_CUT_OFF_TIME(1047, "Payment order could not be updated or cancelled because of cut of time"),
	PO_OPERATION_NOT_AVAILABLE(1048, "Modification/cancellation of PO is unavailable"),
	SO_ALREADY_CANCELLED(1049, "Standing order was already cancelled"),
	MC_ALREADY_CANCELLED(1050, "Mandate collection already has status 'Cancelled'"),
	PRODUCT_CANNOT_PURCHASED_CZ(1052, "Product cannot be purchased"),
	PRODUCT_CANNOT_PURCHASED_HR(1053, "Product cannot be purchased"),
	REG_CODE_RESET(1054, "Limit of incorrect reg codes reached"),
	PO_NOT_ENOUGH_MONEY(1056, "The amount of payment order is greater than the user's balance"),
	SESSION_TERMINATED(1057, "Session terminated"),
	SO_DELETE_CUT_OFF(1058, "Next payment will be executed despite the deletion"),
	SESSION_INVALID_DEVICE(1059, "Using session from device different to session opening device"),
	PRODUCT_FOR_PO_NOT_FOUND(1061, "Product associated with this payment order not found"),
	TRANSFER_TEMPLATE_ALREADY_EXISTS(1062, "Transfer template already exists"),
	UNSUPPORTED_MA_VERSION(1063, "This version is unsupported"),
	SERVICE_UNAVAILIBLE(1064, "Service unavailable"),
	REGISTRATION_RESTRICTED(1065, "Registration restricted"),
	BUSINESS_REQUEST_INVALID(1100, "Business request invalid"),
	ACCESS_DENIED(2001, "Access denied"),
	CLIENT_WRONG_ID(2002, "Invalid client id"),
	INVALID_ORGANIZATION(2003, "Invalid organization"),
	INVALID_CHANNEL_STATUS(2004, "Invalid channel status"),
	INT_CHANNEL_BLOCKED(2005, "Internet channel is blocked"),
	INVALID_PAYMENT_ORDER_ID(2006, "Invalid payment order id"),
	CLIENT_MESSAGE_NOT_SENT(2010, "Failed to send client message"),
	CLIENT_MESSAGE_NOT_FOUND(2011, "Client message not found"),
	PO_APPROVAL_REASON_NEEDED(2020, "Approval reason need to approve PO"),
	DUPLICATE_SUPPORTED_VERSION(2021, "This version already exists"),
	INVALID_DICTIONARY(2030, "Dictionary %s doesn't exists"),
	DICTIONARY_UPLOAD_TIMEDOUT(2031, "Dictionary upload is times out"),
	DICTIONARY_CONCURENT_UPLOAD(2032, "This dictionary upload process is in progress"),
	INVALID_USER_LOGIN(2040, "Invalid user login"),
	INVALID_USER_STATUS(2041, "Invalid user status"),
	PO_INVALID_STATUS(2042, "Invalid payment order status"),
	CONFIG_PARAMETER_HANDLER_ERROR(2043, "Error while executing config parameter update handler"),
	CONFIG_PARAMETER_VALIDATION_ERROR(2044, "Invalid config parameter new value: %s"),
	PO_PROCESSING_ALREADY_IN_PROGRESS(2045, "Payment order with id = %s is being processed by user '%s' started at %s"),
	PO_PROCESSING_ALREADY_FINISHED(2046, "Payment order with id = %s was already processed by user '%s' at %s"),
	PO_PROCESSING_DOESNT_EXIST(2047, "Payment order with id = %s wasn't in the processing"),
	PO_ALREADY_ACCEPTED_BY_AF(2048, "Payment order with id = %s has been already resolved as  GENUINE by anti fraud"),
	PO_ALREADY_REJECTED_BY_AF(2049, "Payment order with id = %s has been already resolved as FRAUDULENT by anti fraud"),
	CONFIG_PARAMETER_NOT_FOUND(2050, "Config parameter not found. %s"),
	ALERT_NOT_FOUND(2051, "Alert no found"),
	CONFIG_PARAMETER_INVALID_HANDLER(2052, "Config parameter invalid handler"),
	LOGIN_IS_DISABLED(2053, "Login is disabled"),
	INCORRECT_EXPORT_FILE_NAME(2060, "Incorrect export file name"),
	FAILED_TO_SEND_MESSAGE(2061, "Failed to send message to FTP server"),
	DEVICE_NAME_DUPLICATE(2062, "The device name has already been set for another device"),
	LANGUAGE_IS_NOT_ALLOWED(2063, "The language is not allowed"),
	ADDRESS_TYPE_NOT_MATCH_FORMAT(2064, "Fields in address does not match type"),
	ADDRESS_TYPE_NOT_ALLOWED(2065, "The address type pronhibited for the bank"),
	PHONE_TYPE_NOT_ALLOWED(2066, "The phone type pronhibited for the bank"),
	EMAIL_INCORRECT_FORMAT(2067, "The email has incorrect format"),
	DEFAULT_PRODUCT_INCORRECT_TYPE(2068, "The product type is not allowed for default product"),
	INCORRECT_PHONE_FORMAT(2069, "The phone number format is wrong"),
	INCORRECT_LOGIN_MINLENGTH(2070, "The login length does not match the MCP setting"),
	MESSAGE_NOT_FOUND(2071, "Message not found"),
	INCORRECT_LOGIN_FORBIDDEN_PATTERNS(2072, "The login symbol does not match the MCP setting"),
	INCORRECT_LOGIN_UNSUPPORTED_SYMBOLS(2073, "The login symbol does not match the MCP setting"),
	DUPLICATE_LOGIN_ALIAS(2074, "The Login alias is already taken"),
	INCORRECT_LOGIN_MAXLENGTH(2075, "The login length does not match the MCP setting"),
	DEVICE_NOT_FOUND(2076, "There's no device specified in request"),
	GROUP_NOT_FOUND(2077, "Group not found"),
	VALUE_NOT_FOUND_IN_CAHCE(2078, "Value not found in cache"),
	PIN_NOT_SPECIFIED(2080, "Pin not specified"),
	HCE_PIN_NOT_YET_SET(2081, "Attempt to call HCE method while PIN not yet set"),
	WALLET_INCORRECT(2082, "Incorrect wallet specified"),
	HCE_WRONG_PIN(2083, "Wrong pin"),
	SAME_ACCOUNT_NUMBER(2201, "Please enter beneficiary account different from debit account"),
	DEVICE_DETAILS_INVALID(2202, "Device specified in request invalid"),
	WRONG_FORMAT_DATE(2203, "Wrong date format"),
	SUBSCRIPTION_ALREADY_EXISTS(2204, "Subscription with these parameters already exists"),
	PROHIBITED_BY_BANK(2205, "Creation is prohibited by the bank"),
	STATEMENT_NOT_DELETED(2206, "Statement don't deleted"),
	USER_ALREADY_LOGGED_IN(2207, "User already logged in"),
	PRODUCT_SUBTYPE_NOT_EXISTS(2210, "Product subtype '%s' does not exist for type '%s'"),
	PRODUCT_TYPE_NOT_SET(2211, "Banking product has no type, but has a subtype '%s'"),
	PRODUCT_LIST_OR_GROUP_NOT_SET(2212, "Banking Product Group or Banking Product hasn't been set"),
	PRODUCT_ALREADY_EXISTS(2213, "Internal product ID '%s' already exists"),
	INVALID_RESPONSE_FROM_ESB(2214, "Invalid response from esb"),
	EMAIL_NOT_AVAILABLE(2220, "Sending confirmation to email is unavailable"),
	EMAIL_NOT_SET(2221, "Email address is not set"),
	FILE_CONFIRMATION_CREATE_ERROR(2223, "Error creating the file confirmation"),
	CONFIRMATION_NOT_FOUND(2224, "Confirmation was not found"),
	KEYWORD_LENGTH_IS_SHORT_OR_EMPTY(2226, "The keyword is too short"),
	MULTIPLE_PAYMENT_NOT_FOUND(2230, "Multiple payment not found"),
	PO_UNSUPPORTED_TYPE(2231, "The type of payment order is not supported"),
	SERVICE_ID_INCORRECT(2667, "Service id incorrect"),
	STATEMENT_NOT_UPDATED(2668, "Statement not updated"),
	STATEMENT_NOT_CANCELLED(2669, "Statement not cancelled"),
	STATEMENT_NOT_CREATED(2670, "Statement not created"),
	METHOD_UNREGISTERED(4001, "Security method is not registered"),
	METHOD_INACTIVE(4002, "Security method is not active"),
	METHOD_TEMP_BLOCKED(4003, "Security method is temporarily blocked for all channels"),
	METHOD_BLOCKED(4004, "Security method is blocked for all channels"),
	CAPTCHA_ERROR(7000, "Client entered incorrect captcha"),
	CREATE_OPERATION_ERROR(2671, "Unable to create operation"),
	OPERATION_EXPIRED(2672, "Operation expired"),
	OPERATION_NOT_FOUND(2673, "Operation not found"),
	OPERATION_CONFIRMED(2674, "Operation already confirmed"),
	OPERATION_DECLINED(2675, "Operation already declined"),
	OPERATION_BLOCKED(2676, "Operation was blocked due to exceeding limit of attempts"),
	OPERATION_ERROR(2677, "Operation was confirmed successfully but not executed"),
	SMS_LIMIT_EXCEEDED(2678, "Sms sending limit is exceeded"),
	EMAIL_LIMIT_EXCEEDED(2679, "Email sending limit is exceeded"),
	CLIENT_NOT_ACTIVE(2680, "Client is not active"),
	MTOKEN_SECURITY_METHOD_INVALID_STATUS(2681, "Status of mToken security method is invalid"),
	CHANNEL_NOT_ACTIVE_OR_ENABLED(2682, "Channel is not active or enabled"),
	MTOKEN_USER_NOT_FOUND(2683, "mToken user was not found"),
	MTOKEN_PIN_NOT_YET_SET(2684, "Attempt to call mToken method while PIN not yet set"),
	PAY_CONTROL_ERROR(2685, "Pay control method call error"),
	UNSUPPORTED_AUTH_METHOD(2686, "Unsupported auth method"),
	INCORRECT_BUSINESS_PROCESS_CODE(2687, "Incorrect business process code in operation data"),
	OPERATION_INCORRECT_STATUS(2688, "Status of operation is incorrect"),
	GENERAL_SERVICE_FAULT(5000, "General service fault"),
	NO_SHA_256(5001, "No SHA-256 algorithm"),
	NO_SHA1PRNG(5002, "No SHA1PRNG algorithm"),
	NO_UTF_8_ENCODING(5003, "No UTF-8 encoding"),
	WRONG_PARAMETER_TYPE(5004, "Parameter '%s' not of type %s"),
	INVALID_CURRENCY_RATE(5005, "Unknown currency rate for ccy = %s bank = %s"),
	INCORRECT_VERSION(5006, "Incorrect version. An empty parameter is not allowed"),
	FAILED_TO_CREATE_XMLGCAL(5007, "Failed to create XMLGregorianCalendar"),
	FAILED_TO_CREATE_ESB_RESP(5011, "Failed to create ESB response from request"),
	FAILED_TO_CREATE_ESB_REQ(5012, "Failed to create ESB request"),;

	private String message;
	private Integer code;

	public String getMessage() {
		return this.message;
	}

	public String getCode() {
		return String.valueOf(this.code);
	}

	public int getIntCode() {
		return code;
	}

	public static CommonResult valueOf(Integer code) {
		for (CommonResult aValues : CommonResult.values()) {
			if (aValues.getCode().equals(String.valueOf(code)))
				return aValues;
		}
		return null;
	}

	public static boolean isSuccess(Integer code) {
		return code != null && code == SUCCESS.getIntCode();
	}

	public static boolean isNotSuccess(Integer code) {
		return !isSuccess(code);
	}

	CommonResult(Integer code, String inputMessage) {
		this.message = inputMessage;
		this.code = code;
	}

	public void updateResult(CommonResponseVO commonResponseVO) {
		commonResponseVO.setResultCode(this.getIntCode());
		commonResponseVO.setResultDescription(this.getMessage());
	}
}
