/*
package com.mahesh.java;

public class ReplaceString {
    public static void main(String[] args) {
        String str="{ \n" +
                "    \"name\": \"xCACConfiguration\",\n" +
                "    \"title\": \"xCACConfiguration\",\n" +
                "    \"data\": {\n" +
                "        \"batchSize\": 10,\n" +
                "        \"maxEvents\": 50,\n" +
                "        \"offerTypes\": [\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    {\n" +
                "                        \"offerType\": \"benefit\",\n" +
                "                        \"offerSubType\": \"dataNatBonus\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"offerType\": \"promotion\",\n" +
                "                        \"offerSubType\": \"reward\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"typeOfOffer\": \"bonus\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    {\n" +
                "                        \"offerType\": \"recharge\",\n" +
                "                        \"offerSubType\": \"\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"typeOfOffer\": \"recharge\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"values\": [\n" +
                "                    {\n" +
                "                        \"offerType\": \"tariffPlan\",\n" +
                "                        \"offerSubType\": \"\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"typeOfOffer\": \"basePlan\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"isJWTEnabled\": false,\n" +
                "        \"voucherPaySrc\": \"voucher\",\n" +
                "        \"interactionRole\": \"interactionCreated\",\n" +
                "        \"autoRechargePoId\": \"PO_MVP_PRE_OPT_RC_AUTO\",\n" +
                "        \"voucherBuyOption\": \"NACT\",\n" +
                "        \"notificationTopic\": \"Notification\",\n" +
                "        \"paymentIdCharName\": \"paymentAgreementId\",\n" +
                "        \"paymentStatusCheck\": false,\n" +
                "        \"simCategoryMapping\": [],\n" +
                "        \"entitySpecification\": \"MobileTechnicalContract\",\n" +
                "        \"interactionCutOfDays\": 10,\n" +
                "        \"recommendationConfig\": {\n" +
                "            \"categoryId\": \"00000000-0000-0000-0000-000000000001\",\n" +
                "            \"upSellDisplayLimit\": \"2\",\n" +
                "            \"crossSellDisplayLimit\": \"2\",\n" +
                "            \"insightRecommendationLimit\": \"2\",\n" +
                "            \"insightRecommendationOffset\": \"0\"\n" +
                "        },\n" +
                "        \"fraudStatusAsAccepted\": \"ACCEPT\",\n" +
                "        \"productExpiryDuration\": {\n" +
                "            \"value\": 3660,\n" +
                "            \"enabled\": true\n" +
                "        },\n" +
                "        \"reasonCodeRefListName\": \"productReasonCode\",\n" +
                "        \"retryForPatchContract\": 3,\n" +
                "        \"updateLifeCycleReason\": true,\n" +
                "        \"contractActionsAllowed\": [\n" +
                "            {\n" +
                "                \"role\": [\n" +
                "                    \"Customer\"\n" +
                "                ],\n" +
                "                \"actions\": [\n" +
                "                    {\n" +
                "                        \"actionId\": \"changeSIM\",\n" +
                "                        \"actionName\": \"Change SIM\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"changeMSISDN\",\n" +
                "                        \"actionName\": \"Change MSISDN\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"changePlan\",\n" +
                "                        \"actionName\": \"Change Plan\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"compensation\",\n" +
                "                        \"actionName\": \"compensation\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"recharge\",\n" +
                "                        \"actionName\": \"Recharge\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"unbar\",\n" +
                "                        \"actionName\": \"Unbar\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"history\",\n" +
                "                        \"actionName\": \"History\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"topUpRecharge\",\n" +
                "                        \"actionName\": \"Top-up Recharge\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"monetaryAdjustment\",\n" +
                "                        \"actionName\": \"monetaryAdjustment\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"voucherLessRecharge\",\n" +
                "                        \"actionName\": \"Voucher-less Recharge\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"purchaseSubscription\",\n" +
                "                        \"actionName\": \"purchaseSubscription\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contractStatus\": \"ContractActive\",\n" +
                "                \"conditionalActions\": [\n" +
                "                    {\n" +
                "                        \"actions\": [\n" +
                "                            {\n" +
                "                                \"actionId\": \"disconnectMultilineUser\",\n" +
                "                                \"actionName\": \"Disconnect Member\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"condition\": \"userRoleExists\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actions\": [\n" +
                "                            {\n" +
                "                                \"actionId\": \"assignMultilineUser\",\n" +
                "                                \"actionName\": \"Assign Member\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"condition\": \"userRoleNotExists\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"role\": [\n" +
                "                    \"Customer\"\n" +
                "                ],\n" +
                "                \"actions\": [\n" +
                "                    {\n" +
                "                        \"actionId\": \"history\",\n" +
                "                        \"actionName\": \"History\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"actionId\": \"portOutReversal\",\n" +
                "                        \"actionName\": \"PortOutReversal\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contractStatus\": \"ContractInactive\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"role\": [\n" +
                "                    \"Customer\"\n" +
                "                ],\n" +
                "                \"actions\": [\n" +
                "                    {\n" +
                "                        \"actionId\": \"history\",\n" +
                "                        \"actionName\": \"History\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contractStatus\": \"ContractSuspended\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"role\": [\n" +
                "                    \"User\"\n" +
                "                ],\n" +
                "                \"actions\": [\n" +
                "                    {\n" +
                "                        \"actionId\": \"topUpRecharge\",\n" +
                "                        \"actionName\": \"Top-up Recharge\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contractStatus\": \"ContractActive\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"journeyDataPatchFields\": [\n" +
                "            {\n" +
                "                \"journeyId\": \"Onboarding\",\n" +
                "                \"restrictedFields\": [\n" +
                "                    \"/portInDetails/preAllocatedNumber\",\n" +
                "                    \"/portInDetails/serviceNumberTransferType\"\n" +
                "                ],\n" +
                "                \"allowedAdditionalFields\": [\n" +
                "                    \"/portInDetails/accountNumber\",\n" +
                "                    \"/portInDetails/dateOfBirth\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": \"mergeCustomer\",\n" +
                "                \"restrictedFields\": [\n" +
                "                    \"/sourceCustomerStatus\",\n" +
                "                    \"/sourceCustomerId\",\n" +
                "                    \"/sourcePartyId\",\n" +
                "                    \"/sourceExternalCustomerId\",\n" +
                "                    \"/destinationCustomerStatus\",\n" +
                "                    \"/remerge\",\n" +
                "                    \"/noOfMergingContracts\"\n" +
                "                ],\n" +
                "                \"allowedAdditionalFields\": []\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": \"mergeCustomer\",\n" +
                "                \"restrictedFields\": [\n" +
                "                    \"/sourceCustomerStatus\",\n" +
                "                    \"/sourceCustomerId\",\n" +
                "                    \"/sourcePartyId\",\n" +
                "                    \"/sourceExternalCustomerId\",\n" +
                "                    \"/destinationCustomerStatus\",\n" +
                "                    \"/remerge\",\n" +
                "                    \"/noOfMergingContracts\"\n" +
                "                ],\n" +
                "                \"allowedAdditionalFields\": []\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": \"mergeCustomer\",\n" +
                "                \"restrictedFields\": [\n" +
                "                    \"/sourceCustomerStatus\",\n" +
                "                    \"/sourceCustomerId\",\n" +
                "                    \"/sourcePartyId\",\n" +
                "                    \"/sourceExternalCustomerId\",\n" +
                "                    \"/destinationCustomerStatus\",\n" +
                "                    \"/remerge\",\n" +
                "                    \"/noOfMergingContracts\"\n" +
                "                ],\n" +
                "                \"allowedAdditionalFields\": []\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": \"mergeCustomer\",\n" +
                "                \"restrictedFields\": [\n" +
                "                    \"/sourceCustomerStatus\",\n" +
                "                    \"/sourceCustomerId\",\n" +
                "                    \"/sourcePartyId\",\n" +
                "                    \"/sourceExternalCustomerId\",\n" +
                "                    \"/destinationCustomerStatus\",\n" +
                "                    \"/remerge\",\n" +
                "                    \"/noOfMergingContracts\"\n" +
                "                ],\n" +
                "                \"allowedAdditionalFields\": []\n" +
                "            }\n" +
                "        ],\n" +
                "        \"relatedInteractionRole\": {\n" +
                "            \"interactionCreated\": \"interactionCreated\",\n" +
                "            \"interactionUpdated\": \"interactionUpdated\"\n" +
                "        },\n" +
                "        \"includePartyInteractions\": false,\n" +
                "        \"lifeCycleReasonForOptOut\": \"PDNN\",\n" +
                "        \"targetRechargePoCharName\": \"targetRecharge\",\n" +
                "        \"updateShoppingCartConfig\": [\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"Onboarding\",\n" +
                "                    \"portOutReversal\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_MSISDN_STD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"resourceNumber\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.msisdn\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_SIM_CARD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"serialNumber\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.simCardNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"pin\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.pin\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"puk\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.puk\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"imsi\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.imsi\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_SC_MAX\",\n" +
                "                            \"PO_MVP_PRE_SC_MBB\",\n" +
                "                            \"PO_MVP_PRE_SC_STD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"accountUUID\",\n" +
                "                                \"valueRef\": \"customerId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"cacid\",\n" +
                "                                \"valueRef\": \"externalCustomerId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"profileId\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.accountProfileId\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"paymentType\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentType\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"partyId\",\n" +
                "                                \"valueRef\": \"partyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentChannel\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentChannel\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentTransactionId\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentTransactionId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"authorizedPartyId\",\n" +
                "                                \"valueRef\": \"journeyData.characteristics.authorizedPartyId.value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"migration\",\n" +
                "                                \"valueRef\": \"journeyData.characteristics.migration.value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"preAllocatedNumber\",\n" +
                "                                \"valueRef\": \"journeyData.portOutReversalDetails.preAllocatedNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerAuthorityDate\",\n" +
                "                                \"valueRef\": \"journeyData.portOutReversalDetails.customerAuthorityDate\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"oldContractId\",\n" +
                "                                \"valueRef\": \"journeyData.portOutReversalDetails.oldContractId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"PostpaidOnboarding\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_POS_SIM_CARD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"deviceID\",\n" +
                "                                \"valueRef\": \"interactionItem.PostpaidOnboarding.item.interactionItemData.activationDetails.simCardNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"imsi\",\n" +
                "                                \"valueRef\": \"interactionItem.PostpaidOnboarding.item.interactionItemData.activationDetails.imsi\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_POS_MSISDN\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"SDP_ID\",\n" +
                "                                \"valueRef\": \"interactionItem.PostpaidOnboarding.item.interactionItemData.activationDetails.sdpId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"resourceNumber\",\n" +
                "                                \"valueRef\": \"interactionItem.PostpaidOnboarding.item.interactionItemData.activationDetails.msisdn\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"partyInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"relatedParty\",\n" +
                "                                \"valueRef\": \"relatedParty\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"role\": [\n" +
                "                            \"BillingCustomer\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"role\",\n" +
                "                                \"valueRef\": \"relatedParty.role\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"relatedParty\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"voucherRecharge\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"voucherSerialNumber\",\n" +
                "                                \"valueRef\": \"journeyData.rechargeDetails.voucherSerialNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"autoRecharge\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentType\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentType\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentChannel\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentChannel\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentTransactionId\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentTransactionId\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"portIn\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_OPT_MSISDN_PORT\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"serviceTransferType\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.serviceNumberTransferType\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"temporaryMSISDN\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.preAllocatedNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"portInMSISDN\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.msisdn\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"dateOfBirth\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.dateOfBirth\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"providerAccount\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.accountNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"provider\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.serviceProviderID\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"portRequestDate\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.customerAuthorityDate\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"portType\",\n" +
                "                                \"valueRef\": \"journeyData.portInDetails.portInType\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"customerInformation\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_OPT_CUSTOMER_DATA\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"contactMediumType\",\n" +
                "                                \"valueRef\": \"$..contactMediumType\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"birthDate\",\n" +
                "                                \"valueRef\": \"$..birthDate\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"countryOfBirth\",\n" +
                "                                \"valueRef\": \"$..countryOfBirth\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"aristocraticTitle\",\n" +
                "                                \"valueRef\": \"$..aristocraticTitle\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"nationality\",\n" +
                "                                \"valueRef\": \"$..nationality\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"reason\",\n" +
                "                                \"valueRef\": \"$..reason\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"mobile\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PhoneContact')].contactMediumValue[?(@.purpose == 'Telephone')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"landline\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PhoneContact')].contactMediumValue[?(@.purpose == 'Telephone')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"adressline1\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PostalContact')].contactMediumValue[?(@.purpose == 'ADDRESS_LINE_1')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"adressline2\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PostalContact')].contactMediumValue[?(@.purpose == 'ADDRESS_LINE_2')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"province\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PostalContact')].contactMediumValue[?(@.purpose == 'STATE')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"city\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PostalContact')].contactMediumValue[?(@.purpose == 'CITY')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"postcode\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='PostalContact')].contactMediumValue[?(@.purpose == 'POSTCODE')].value\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"email\",\n" +
                "                                \"valueRef\": \"$..contactMediums[?(@.contactMediumType=='EmailContact')].contactMediumValue[?(@.purpose == 'EmailContact')].value\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"recharge\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"paymentType\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentType\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentChannel\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentChannel\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentTransactionId\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentTransactionId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"5gExpiry\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"autoRechargeOptIn\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"autoRechargeOptOut\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"rechargeOptIn\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"paymentType\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentType\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentChannel\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentChannel\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"paymentTransactionId\",\n" +
                "                                \"valueRef\": \"journeyData.payment.paymentTransactionId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"compensation\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"changeSim\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"changeMsisdn\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"changePlan\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"deactivateContract\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"resumeContract\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"suspendContract\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"organizationMemberOnboarding\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_MSISDN_STD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"resourceNumber\",\n" +
                "                                \"valueRef\": \"interactionItem.organizationMemberOnboarding.item.interactionItemData.activationDetails.msisdn\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_SIM_CARD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"serialNumber\",\n" +
                "                                \"valueRef\": \"interactionItem.organizationMemberOnboarding.item.interactionItemData.activationDetails.simCardNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"pin\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.pin\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"puk\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.puk\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"imsi\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.imsi\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"partyInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"relatedParty\",\n" +
                "                                \"valueRef\": \"relatedParty\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"role\": [\n" +
                "                            \"User\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"role\",\n" +
                "                                \"valueRef\": \"relatedParty.role\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"relatedParty\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"purchaseSubscription\",\n" +
                "                    \"renewSubscription\",\n" +
                "                    \"deactivateSubscription\",\n" +
                "                    \"activateSubscription\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"addOrganizationContract\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_MSISDN_STD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"resourceNumber\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.msisdn\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_SIM_CARD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"serialNumber\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.simCardNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"pin\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.pin\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"puk\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.puk\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"imsi\",\n" +
                "                                \"valueRef\": \"journeyData.activationDetails.imsi\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"customerInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"relatedParty\",\n" +
                "                                \"valueRef\": \"relatedParty\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"role\": [\n" +
                "                            \"PaymentResponsible\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"role\",\n" +
                "                                \"valueRef\": \"relatedParty.role\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"relatedParty\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"journeyId\": [\n" +
                "                    \"prepaidOnboarding\"\n" +
                "                ],\n" +
                "                \"journeyConfig\": [\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_MSISDN_STD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"resourceNumber\",\n" +
                "                                \"valueRef\": \"interactionItem.prepaidOnboarding.item.interactionItemData.activationDetails.msisdn\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_SIM_CARD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"serialNumber\",\n" +
                "                                \"valueRef\": \"interactionItem.prepaidOnboarding.item.interactionItemData.activationDetails.simCardNumber\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"pin\",\n" +
                "                                \"valueRef\": \"interactionItem.prepaidOnboarding.item.interactionItemData.activationDetails.pin\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"puk\",\n" +
                "                                \"valueRef\": \"interactionItem.prepaidOnboarding.item.interactionItemData.activationDetails.puk\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"imsi\",\n" +
                "                                \"valueRef\": \"interactionItem.prepaidOnboarding.item.interactionItemData.activationDetails.imsi\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"poId\": [\n" +
                "                            \"PO_MVP_PRE_SC_MAX\",\n" +
                "                            \"PO_MVP_PRE_SC_MBB\",\n" +
                "                            \"PO_MVP_PRE_SC_STD\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"accountUUID\",\n" +
                "                                \"valueRef\": \"customerId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"cacid\",\n" +
                "                                \"valueRef\": \"externalCustomerId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"profileId\",\n" +
                "                                \"valueRef\": \"interactionItem.prepaidOnboarding.item.interactionItemData.activationDetails.accountProfileId\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"productCharacteristic\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"partyInteractionId\",\n" +
                "                                \"valueRef\": \"id\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"journeyId\",\n" +
                "                                \"valueRef\": \"journeyId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"channelName\",\n" +
                "                                \"valueRef\": \"channelName\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"key\": \"relatedParty\",\n" +
                "                                \"valueRef\": \"relatedParty\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"attribute\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"role\": [\n" +
                "                            \"User\"\n" +
                "                        ],\n" +
                "                        \"characteristics\": [\n" +
                "                            {\n" +
                "                                \"key\": \"role\",\n" +
                "                                \"valueRef\": \"relatedParty.role\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"characteristicType\": \"relatedParty\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"onboardingOfferNameFilter\": [\n" +
                "            {\n" +
                "                \"offerType\": \"activationBundle\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"tariffPlan\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"optional\",\n" +
                "                \"offerSubType\": \"access5g\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"recharge\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"addOn\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"benefit\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"promotion\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"serviceClass\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"offerType\": \"access\",\n" +
                "                \"offerSubType\": \"\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"rechargePaymentValidation\": {\n" +
                "            \"byPassChannelList\": [\n" +
                "                \"EpoD\",\n" +
                "                \"SIFT\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"productBucketConfiguration\": {\n" +
                "            \"bucketType\": [\n" +
                "                {\n" +
                "                    \"bucketName\": \"SMS\",\n" +
                "                    \"bucketValue\": 5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"bucketName\": \"VOICE\",\n" +
                "                    \"bucketValue\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"bucketName\": \"DATA\",\n" +
                "                    \"bucketValue\": 6\n" +
                "                }\n" +
                "            ],\n" +
                "            \"unitOfMeasureForSMS\": \"unit\",\n" +
                "            \"unitOfMeasureForData\": \"bytes\",\n" +
                "            \"unitOfMeasureForVoice\": \"seconds\"\n" +
                "        },\n" +
                "        \"compensationCodeRefListName\": \"mvp_compensationCode\",\n" +
                "        \"productOfferSwappableFields\": [\n" +
                "            {\n" +
                "                \"productType\": \"serviceClass\",\n" +
                "                \"productCharacteristics\": [\n" +
                "                    \"cacid\",\n" +
                "                    \"uuid\",\n" +
                "                    \"profileId\"\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"referenceListCacheTTLSecond\": \"86400\",\n" +
                "        \"userProfileCreationRequired\": false,\n" +
                "        \"portoutReversalConfiguration\": {\n" +
                "            \"portOutReversalMaxDays\": \"180\",\n" +
                "            \"portOutReversalAllowedReason\": [\n" +
                "                \"DEPO\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"productOfferingConfiguration\": {\n" +
                "            \"defaultCurrencyForPrice\": \"INR\"\n" +
                "        },\n" +
                "        \"retryPatchCustomerForMergeCI\": 3,\n" +
                "        \"extendExpiryForSuspensionFlag\": false,\n" +
                "        \"lifeCycleStateCodeRefListName\": \"LifeCycleState\",\n" +
                "        \"productQualificationCheckConfig\": [\n" +
                "            {\n" +
                "                \"journeyId\": \"voucherRecharge\",\n" +
                "                \"catalogContext\": {\n" +
                "                    \"categoryId\": \"resMobPreRecharges\",\n" +
                "                    \"contextInformation\": {\n" +
                "                        \"contextSpecification\": \"mvp_catalogContext\",\n" +
                "                        \"contextCharacteristic\": [\n" +
                "                            {\n" +
                "                                \"name\": \"voucherProfileId\",\n" +
                "                                \"value\": \"journeyData.rechargeDetails.voucherGroupId\"\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"name\": \"customerJourney\",\n" +
                "                                \"value\": \"journeyId\"\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    \"productOfferingFilter\": \"productOffering.category.id=resMobPreRecharges,productOffering.category.id.in=[resMobPreAddons,resMobPreRecharges], {productOffering.productOfferingRelationship.contains=[{target.id=<BasePlanPoId>},{relationType.in=[optionalFor]}]}\",\n" +
                "                    \"returnedProductOfferingFields\": \"id,name\"\n" +
                "                }\n" +
                "            }\n" +
                "        ],\n" +
                "        \"directFulfillmentChannelNameConfig\": {\n" +
                "            \"value\": \"orderConnector\",\n" +
                "            \"journeyId\": [\n" +
                "                \"monetaryAdjustment\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"onboardingNoOfResourcesCalculation\": {\n" +
                "            \"resourcesOfferFilter\": [\n" +
                "                {\n" +
                "                    \"offerType\": \"sim\",\n" +
                "                    \"offerSubType\": \"\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"offerType\": \"msisdn\",\n" +
                "                    \"offerSubType\": \"\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"productCharacteristics\": [\n" +
                "                \"imsi\",\n" +
                "                \"pin\",\n" +
                "                \"puk\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"requiredWorkFlowForAttributesConfig\": {\n" +
                "            \"evalutationConditionConfig\": [\n" +
                "                {\n" +
                "                    \"operation\": \"ADD\",\n" +
                "                    \"conditions\": [\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..[?(@.contactMediumType in ['PostalContact', 'EmailContact'])]\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..paymentMethod\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"operation\": \"UPDATE\",\n" +
                "                    \"conditions\": [\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..[?(@.contactMediumType in ['PostalContact', 'EmailContact'])]\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..paymentMethod\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..birthDate\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..countryOfBirth\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..aristocraticTitle\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..nationality\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                {\n" +
                "                    \"operation\": \"DELETE\",\n" +
                "                    \"conditions\": [\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..contactMediumType\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"predicate\": \"$..paymentMethod\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"retryCountForCheckInvocationAllowed\": 3,\n" +
                "        \"ecmAllowedActionCacheReloadFrequency\": 1\n" +
                "    }\n" +
                "}\n" +
                "\n";



        str=str.replaceAll("includePartyInteractions\": false,\n","includePartyInteractions\": true,\n");
//        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\"apiName\"").append(":").append("\"configurations\"").append(",").
                append("\"configurationName\"").append(":").append("\"xCACConfiguration\"").append(",")
                .append("\"data\"").append(":").append("{").append(str.replaceAll(""\", "<\\/")).append("}}");

        System.out.println(stringBuilder.toString());

    }
}
*/
