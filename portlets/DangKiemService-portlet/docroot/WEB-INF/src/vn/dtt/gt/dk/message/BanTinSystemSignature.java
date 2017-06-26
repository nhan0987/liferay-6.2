package vn.dtt.gt.dk.message;

public class BanTinSystemSignature {
	
	public static String systemSignature() {
		StringBuilder xmlResult = new StringBuilder("");
			xmlResult.append(" <SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\">");
				xmlResult.append(" <CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\" />");
				xmlResult.append(" <SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\" />");
				xmlResult.append(" <Reference URI=\"\">");
					xmlResult.append(" <Transforms>");
						xmlResult.append(" <Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" />");
					xmlResult.append("</Transforms>");
					xmlResult.append(" <DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\" />");
					xmlResult.append(" <DigestValue>").append("iTUQBaDYk1ZfiMUg2i9Ika43lno=").append("</DigestValue>");
				xmlResult.append("</Reference>");
			xmlResult.append("</SignedInfo>");
			xmlResult.append(" <SignatureValue>").append("UyqJA0Oa+Yx9fLikPTK70BA0r/MGuNuEcseUxhNUoLI4e3rtZ3HAZJmuM5EA7V0EwDuRMxvyPvLHdBMuA1r2M4UE2+tV+B8jpeb9ljL720w9Ja4zlxge9IXny1SVEyK2XirSUaDTfiAoR/LF0rc08yscM0g5gjNZ0k2JRDbQ13o/VFTDafG1pOwE/pLX9iYEHCf2ri4F8tORTKSu02t4bIS2hPfJnijHyn/DQnuCR0CqjPvuH8bZR6A0p+N1IlLjQbPbATVI192DBWZjIgcO77CnRnlWiK2490FAmvqjgN63l51er8+zSOQzqcpPTOKPnifKIn8lq/wNyJDIynmwTA==").append("</SignatureValue>");
			xmlResult.append(" <KeyInfo>");
				xmlResult.append(" <X509Data>");
					xmlResult.append(" <X509IssuerSerial>");
						xmlResult.append(" <X509IssuerName>").append("System.Security.Cryptography.X509Certificates.X500DistinguishedName").append("</X509IssuerName>");
						xmlResult.append(" <X509SerialNumber>").append("87061190721381547758718672444724028689").append("</X509SerialNumber>");
					xmlResult.append("</X509IssuerSerial>");
					xmlResult.append(" <X509Certificate>").append("MIIC5TCCAc2gAwIBAgIQQX9gG42sW6hL0v9juJslETANBgkqhkiG9w0BAQUFADAaMRgwFgYDVQQDEw9XTVN2Yy1UQy1FV0VCMDIwHhcNMTMwOTIzMDcyMDQwWhcNMjMwOTIxMDcyMDQwWjAaMRgwFgYDVQQDEw9XTVN2Yy1UQy1FV0VCMDIwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCeZFLULnefWU2daoubyEfvng2I5RhRydT8XyLiJW7o0bCt5Eze5y+4By1DFtLICpCRXwXFO8ne8vCQp1Dae7d3WbPxMn3TUhFiNs2KaQndhBBtQyD5xibDIIwR8WTqxX93XvL/MAnaR4LJuNkDE/BMzsju7dbxCYeFHBTPyp6bEbizG1lq0TW1uAKG0tqICmfiMcEmwbKMrNWRGFxfOj6HKJHIyLKoArlxJ2fiNkt2LYw1E45XrKC5EcphPG3uu2Zh8sqOWO7/BTX2kx4z7VPl/+4h9InB0pPmAqsFDs8T1HoISJDuDF8TIU0vNHdGHYbmaj3xfWryKXWdvr9mQttXAgMBAAGjJzAlMBMGA1UdJQQMMAoGCCsGAQUFBwMBMA4GA1UdDwQHAwUAsAAAADANBgkqhkiG9w0BAQUFAAOCAQEAZeQ2jJw/V8P4+P9sKDjjsIXMlllOk47le0TAORIlFMT/1js6nWCtB6EkA+oY/fwel8Dk0rok717cs9vX1p4e0JsHJiLenSOD5/9bg/FEXCAXc65lY53TiGfGAdwQB4iUMH64IZ4TVzqwX4LIvilFeUqlwj4/04ykWsK6bA6eqSdYovlSe4tkmc+EBeyEsU+1sW2av5sOdkQXyXKk02316/lJshkMUqkYjDSOoLApE6HMG/UQRrymcn6+o9413yGWFszzNSub1y1jrTG1jyNmEFPB+lqT+NLrNXQxPZ741QD/MRjLeIn+3C7b8W284sIzkYZmA5EfiSnn2XjCQbeWGw==").append("</X509Certificate>");
				xmlResult.append("</X509Data> ");
			xmlResult.append("</KeyInfo>");
		
		return xmlResult.toString();
	}
}
