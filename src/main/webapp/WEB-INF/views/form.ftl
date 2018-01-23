<#include "/form-builder.ftl" />
<html>
	<head>
		<title>
			<@spring.messageText "${page.title}" "${page.title}"/>
		</title>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<form method='post' action='${page.properties.creation?exists?then('./create', '../update')}'>
						<div class="col-md-12 column">
							<#-- 
							enctype="application/json; charset=utf-8"
							-->
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<@spring.showErrors "<br/>" "text-danger"/>
								</div>
							</div>
							<#list page.formFields?keys as path>
								<#assign field = page.formFields[path] />
								<div class="form-group">
									<#if field.type != 'HIDDEN'>
										<label class="col-sm-2 text-right control-label ${field.mandatory?then('required', '')}"><@spring.messageText "${field.label}" "${field.label}"/></label>
									</#if>
									<div class="col-sm-10">
										${field.view!}
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10 bg-danger">
										<@form.errors path="${field.name}" cssClass="error" />
									</div>
								</div>
							</#list>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<#--
									em caso de submissão ajax
									<button type="button" class="btn btn-primary" onclick="submitForm($(this))"><@spring.messageText "form.button.save" "form.button.save"/></button>
									-->
									<input type="submit" class="btn btn-primary" value="<@spring.messageText "form.button.save" "form.button.save"/>"/>
									<button type="reset" class="btn btn-default"><@spring.messageText "form.button.clean" "form.button.clean"/></button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>